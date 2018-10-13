package com.xuexi.spring;

import java.lang.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

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
 * @CreateDate 2018-10-13 下午3:01
 * @Encoding UTF-8
 * @Version 1.0
 * @NeedThreadSave false
 * @WebSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
@Component
public class BeanNameAwareTest implements BeanNameAware
{
	private final Logger logger = LoggerFactory.getLogger(BeanNameAwareTest.class);

	@Override
	public void setBeanName(String s)
	{
		//暂未实现 by hanxu at 18-10-13-下午3:01

	}
}
