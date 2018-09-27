package com.gfyt.core.storage.api;

import com.gfyt.core.bean.entity.core.BaseEntity;
import com.gfyt.core.bean.entity.core.BaseResult;

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
 * @CreateDate 2018-09-21 下午2:53
 * @Encoding UTF-8
 * @Version 1.0
 * @NeedThreadSave false
 */
public interface BaseDao<T extends BaseEntity>
{
	public BaseResult save(T entity);

	public BaseResult update(T entity);

	public BaseResult delete(T entity);

	public BaseResult query(T entity);
}
