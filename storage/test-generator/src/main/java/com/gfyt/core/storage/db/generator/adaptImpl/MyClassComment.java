package com.gfyt.core.storage.db.generator.adaptImpl;

import java.util.*;
import java.lang.*;

import com.gfyt.core.storage.db.generator.adaptInterface.ClassComment;
import com.gfyt.core.storage.db.generator.adaptInterface.CustomCommentGenerator;
import org.apache.commons.lang3.*;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 * @CreateDate 2018-09-29 下午4:04
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public class MyClassComment implements ClassComment
{
	private final Logger logger = LoggerFactory.getLogger(MyClassComment.class);

	public CustomCommentGenerator customCommentGenerator;
	public MyClassComment(CustomCommentGenerator customCommentGenerator){
		this.customCommentGenerator=customCommentGenerator;
	}

	@Override
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable)
	{
		//TODO 暂未实现 by hanxu at 18-9-29-下午4:04
		logger.warn("com.gfyt.core.storage.db.generator.adaptImpl.MyClassComment.addClassComment()==>方法暂未实现 by hanxu at 18-9-29-下午4:04");

	}

	@Override
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete)
	{
		//TODO 暂未实现 by hanxu at 18-9-29-下午4:04
		logger.warn("com.gfyt.core.storage.db.generator.adaptImpl.MyClassComment.addClassComment()==>方法暂未实现 by hanxu at 18-9-29-下午4:04");

	}

	@Override
	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
	{
		//TODO 暂未实现 by hanxu at 18-9-29-下午4:04
		logger.warn("com.gfyt.core.storage.db.generator.adaptImpl.MyClassComment.addModelClassComment()==>方法暂未实现 by hanxu at 18-9-29-下午4:04");

	}
}
