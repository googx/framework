package com.gfyt.core.storage.db.generator.adaptImpl;

import com.gfyt.core.storage.db.generator.adaptInterface.CustomCommentGenerator;
import com.gfyt.core.storage.db.generator.adaptInterface.JavaFileComment;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
 * @CreateDate 2018-09-29 下午3:41
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public class MyFileComment implements JavaFileComment
{
	private final Logger logger = LoggerFactory.getLogger(MyFileComment.class);

	//	先这样简单实现,如果后期有需求,需要有大量生成java类型的代码,
	// 在来重新系统掌握下mybaties的生成代码技术框架,
	// 在抽象封装一个,现在时间不允许我这么做
	CustomCommentGenerator generator;

	public MyFileComment(CustomCommentGenerator customCommentGenerator)
	{
		this.generator = customCommentGenerator;
	}

	@Override
	public void addJavaFileComment(CompilationUnit compilationUnit)
	{
		this.addImportClass(compilationUnit);
	}

	protected void addImportClass(CompilationUnit compilationUnit)
	{
		compilationUnit.addImportedType(new FullyQualifiedJavaType(NotNull.class.getName()));
		compilationUnit.addImportedType(new FullyQualifiedJavaType(Size.class.getName()));
	}
}
