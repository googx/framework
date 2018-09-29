package com.gfyt.core.storage.db.generator.adaptInterface;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.TopLevelClass;

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
 * @CreateDate 2018-09-29 下午4:03
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public interface ClassComment
{
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable);

	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete);

	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable);
}
