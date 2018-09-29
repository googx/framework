package com.gfyt.core.storage.db.generator.adaptImpl;

import com.gfyt.core.storage.db.generator.adaptInterface.ConfigurationProperties;
import com.gfyt.core.storage.db.generator.adaptInterface.CustomCommentGenerator;
import com.gfyt.core.storage.db.generator.adaptInterface.JavaDocTagComment;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.internal.util.StringUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * <b>功能说明:</b><p>
 * 一些说明写这里
 * </p></br> <b>设计思想、目的:</b><p>
 * 一些说明写这里
 * </p></br><b>设计缺陷: </b>
 * <p>
 * 一些说明写这里
 * </p>
 *
 * @author hanxu
 * @version 1.0
 * @CreateDate 2018-09-29 下午4:13
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public class MyJavaDocTagComment implements JavaDocTagComment, ConfigurationProperties
{
	private final Logger logger = LoggerFactory.getLogger(MyJavaDocTagComment.class);
	CustomCommentGenerator generator;

	public MyJavaDocTagComment(CustomCommentGenerator commentGenerator)
	{
		this.generator = commentGenerator;
	}

	/**
	 * This method adds the custom javadoc tag for. You may do nothing if you do not wish to include the Javadoc tag -
	 * however, if you do not include the Javadoc tag then the Java merge capability of the eclipse plugin will break.
	 *
	 * @param javaElement       the java element
	 * @param markAsDoNotDelete the mark as do not delete
	 * @date
	 * @author
	 */
	@Override
	public void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete)
	{
		javaElement.addJavaDocLine(" *"); //$NON-NLS-1$
		//		StringBuilder sb = new StringBuilder();
		//		sb.append(" * "); //$NON-NLS-1$
		//		"@mbg.generated"; //$NON-NLS-1$
		//				sb.append(MergeConstants.NEW_ELEMENT_TAG);
		javaElement.addJavaDocLine("* @date " + getDateString());

		javaElement.addJavaDocLine("* @author " + getAuthor());
		if(markAsDoNotDelete)
		{
			javaElement.addJavaDocLine(" do_not_delete_during_merge");
		}

	}

	@Override
	public void addJavadocTag(JavaElement javaElement, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, boolean markAsDoNotDelete)
	{
		String tableName = introspectedTable.getFullyQualifiedTable().toString();
		String columnName = introspectedColumn.getActualColumnName();
		List<String> javadocAnnotations = new ArrayList<>();
		boolean autoIncrement = introspectedColumn.isAutoIncrement();
		boolean generatedColumn = introspectedColumn.isGeneratedColumn();
		addCommentInfo(autoIncrement, javadocAnnotations, "@autoIncrement true");
		addCommentInfo(generatedColumn, javadocAnnotations, "@GeneratedColumn true ");
		String format = String.format("列[%s].[%s]声明不规范", tableName, columnName);
		if(generatedColumn)
		{

			logger.warn("addFieldComment()==>该字段" + format + "为Mysql数据库动态生成列,禁止设置值!");
			//				field.setFinal(true);
		}
		//禁止使用此列
		boolean blobColumn = introspectedColumn.isBLOBColumn();
		if(blobColumn)
		{

			if(isSupportforceBLOB)
			{
				logger.warn("addFieldComment()==>" + format + "我们数据库规范,禁止使用BLOB数据类型,因为该类型会造成数据库查询性能缓慢,请和你的小组讨论是否一定要使用该数据类型!");
			}
			else
			{
				throw new RuntimeException(format + ",我们数据库规范禁止使用BLOB数据类型,因为该类型会造成数据库查询性能缓慢,如果一定要使用,请在配置字段里加上isSupportforceBLOB=true");
			}
		}

		this.addJavadocTag(javaElement, markAsDoNotDelete);
	}

	private void addCommentInfo(boolean codition, List<String> data, String value)
	{
		if(codition)
		{
			data.add(value);
		}
	}

	/**
	 * Returns a formated date string to include in the Javadoc tag
	 * and XML comments. You may return null if you do not want the date in
	 * these documentation elements.
	 *
	 * @return a string representing the current timestamp, or null
	 */
	public String getDateString()
	{
		String s = generator.getDateString();
		StringBuilder sb = new StringBuilder();
		if(s != null)
		{
			sb.append(' ');
			sb.append(s);
		}
		return sb.toString();
	}

	public String getAuthor()
	{
		String s = generator.getAuthor();
		StringBuilder sb = new StringBuilder();
		if(s != null)
		{
			sb.append(' ');
			sb.append(s);
		}
		return sb.toString();
	}

	Properties properties;

	protected boolean suppressAllComments, addRemarkComments;
	protected boolean isSupportforceBLOB;

	@Override
	public void addConfigurationProperties(Properties properties)
	{
		this.properties = properties;
		this.suppressAllComments = StringUtility.isTrue(properties.getProperty("suppressAllComments"));
		this.isSupportforceBLOB = StringUtility.isTrue(properties.getProperty("isSupportforceBLOB", "false"));
		this.addRemarkComments = StringUtility.isTrue(properties.getProperty("addRemarkComments"));
	}
}
