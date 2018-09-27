package com.gfyt.core.bean.entity.core;

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
 * @CreateDate 2018-09-27 下午2:52
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public class FinalResult<R> implements BaseResult<R>
{
	private final R value;

	public FinalResult(R value)
	{
		this.value = value;
	}

	@Override
	public R get()
	{
		return this.value;
	}
}
