package com.gfyt.test.service;

import java.lang.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
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
public class BeanNameAwareTest implements BeanNameAware,BeanPostProcessor,BeanFactoryAware
{
	private final Logger logger = LoggerFactory.getLogger(BeanNameAwareTest.class);

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException
	{
		//暂未实现 by hanxu at 18-10-13-下午8:00
		logger.warn("setBeanFactory==>暂未实现 by hanxu at 18-10-13-下午8:00");

	}

	@Override
	public void setBeanName(String s)
	{
		//暂未实现 by hanxu at 18-10-13-下午8:00
		logger.warn("setBeanName==>暂未实现 by hanxu at 18-10-13-下午8:00");

	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
	{
		//暂未实现 by hanxu at 18-10-13-下午8:09
		logger.warn("postProcessBeforeInitialization==>暂未实现 by hanxu at 18-10-13-下午8:09"+beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
	{
		//暂未实现 by hanxu at 18-10-13-下午8:09
		logger.warn("postProcessAfterInitialization==>暂未实现 by hanxu at 18-10-13-下午8:09"+beanName);
		return bean;
	}
}
