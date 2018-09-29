package com.gfyt.core.storage.db.generator;

import com.gfyt.core.storage.db.generator.adaptImpl.MyAddFieldComment;
import com.gfyt.core.storage.db.generator.adaptImpl.MyClassComment;
import com.gfyt.core.storage.db.generator.adaptImpl.MyFileComment;
import com.gfyt.core.storage.db.generator.adaptImpl.MyJavaDocTagComment;
import com.gfyt.core.storage.db.generator.adaptInterface.*;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * <b>功能说明:</b><p>
 * 具体的生成这个java文件的实现类是这个{@link org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl}
 * 使用模板模式, 由于该类的扩展基本全是由内部代码设定完成,对外通过xml文件方式真是没有提供扩展方法, java的扩展方式暂时
 * public List<GeneratedJavaFile> getGeneratedJavaFiles()
 * </p></br> <b>设计思想、目的:</b><p>
 * 一些说明写这里
 * </p></br><b>设计缺陷: </b>
 * <p>
 * 一些说明写这里
 * </p>
 *
 * @author hanxu
 * @version 1.0
 * @CreateDate 2018-09-28 下午1:30
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public class MyCommentGeneratorAdapt extends DefaultCommentGenerator implements CustomCommentGenerator
{
	AlterFieldComment alterFieldComment = new MyAddFieldComment(this);
	JavaFileComment javaFileComment = new MyFileComment(this);
	ClassComment classComment = new MyClassComment(this);
	JavaDocTagComment javaDocTagComment=new MyJavaDocTagComment(this);
	private Logger logger = LoggerFactory.getLogger(MyCommentGeneratorAdapt.class);

	protected Properties properties;

	@Override
	public void addJavaFileComment(CompilationUnit compilationUnit)
	{
		//		compilationUnit该类在1.3.6版本的生成器里是TopLevelClass对象,由于该版本中在配置文件中还没有对外暴露的javaModelGenerator类型处理器,
		//		由于不想直接修改源码,所以通过将CompilationUnit接口对象来强制转成TopLevelClass,来起到修改类的作用.具体代码参考以下getCompilationUnits方法
		//		org.mybatis.generator.codegen.mybatis3.model.BaseRecordGenerator
		super.addJavaFileComment(compilationUnit);
		javaFileComment.addJavaFileComment(compilationUnit);
	}

	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable)
	{
		alterFieldComment.addFieldComment(field, introspectedTable);
	}

	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn)
	{
		alterFieldComment.addFieldComment(field, introspectedTable, introspectedColumn);
	}

	@Override
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable)
	{
		this.classComment.addClassComment(innerClass, introspectedTable);
	}

	@Override
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete)
	{
		this.classComment.addClassComment(innerClass, introspectedTable, markAsDoNotDelete);
	}

	@Override
	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
	{
		this.classComment.addModelClassComment(topLevelClass, introspectedTable);
	}

	@Override
	public void addConfigurationProperties(Properties properties)
	{
		super.addConfigurationProperties(properties);
		this.properties = properties;
		this.alterFieldComment.addConfigurationProperties(properties);
		this.javaDocTagComment.addConfigurationProperties(properties);
	}

	@Override
	public void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete)
	{
		javaDocTagComment.addJavadocTag(javaElement,markAsDoNotDelete );
	}

	@Override
	public void addJavadocTag(JavaElement javaElement, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, boolean markAsDoNotDelete)
	{
		javaDocTagComment.addJavadocTag(javaElement,introspectedTable ,introspectedColumn ,markAsDoNotDelete );
	}

	@Override
	public String getDateString()
	{
		return super.getDateString();
	}

	@Override
	public String getAuthor()
	{
		//TODO 暂未实现 by hanxu at 18-9-29-下午4:37
		logger.warn("com.gfyt.core.storage.db.generator.MyCommentGeneratorAdapt.getAuthor()==>方法暂未实现 by hanxu at 18-9-29-下午4:37");
		return null;
	}
}
