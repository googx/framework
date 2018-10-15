package com.fraw.junit.test.spring.core;

import java.util.*;
import java.lang.*;

import org.junit.runner.Runner;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;
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
 * @CreateDate 2018-10-13 下午6:19
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public class MySuiteClasses extends Suite
{
	private final Logger logger = LoggerFactory.getLogger(MySuiteClasses.class);

	public MySuiteClasses(Class<?> klass, RunnerBuilder builder) throws InitializationError
	{
		this(builder,klass,new BatchSuiteTest().scanPackage().toArray(new Class[]{}));
	}


	public MySuiteClasses(RunnerBuilder builder, Class<?>[] classes) throws InitializationError
	{
		super(builder, classes);
	}

	protected MySuiteClasses(Class<?> klass, Class<?>[] suiteClasses) throws InitializationError
	{
		super(klass, suiteClasses);
	}

	protected MySuiteClasses(RunnerBuilder builder, Class<?> klass, Class<?>[] suiteClasses) throws InitializationError
	{
		super(builder, klass, suiteClasses);
	}

	protected MySuiteClasses(Class<?> klass, List<Runner> runners) throws InitializationError
	{
		super(klass, runners);
	}
}
