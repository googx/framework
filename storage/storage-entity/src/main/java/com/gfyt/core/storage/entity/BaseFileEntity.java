package com.gfyt.core.storage.entity;

import java.io.File;

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
 * @CreateDate 2018-09-21 下午4:25
 * @Encoding UTF-8
 * @Version 1.0
 * @NeedThreadSave false
 * * @CompanySite <a href="https://www.58chedai.com">访问公司主页</a>
 */
public interface BaseFileEntity extends BaseEntity
{
	File getEntity();
}
