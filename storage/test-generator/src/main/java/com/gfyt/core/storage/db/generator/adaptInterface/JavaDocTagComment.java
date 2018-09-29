package com.gfyt.core.storage.db.generator.adaptInterface;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.JavaElement;

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
 * @CreateDate 2018-09-29 下午4:12
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public interface JavaDocTagComment extends ConfigurationProperties
{
	void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete);

	//	public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn)
	public void addJavadocTag(JavaElement javaElement, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, boolean markAsDoNotDelete);
}
