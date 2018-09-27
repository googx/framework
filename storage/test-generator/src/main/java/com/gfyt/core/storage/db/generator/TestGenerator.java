package com.gfyt.core.storage.db.generator;

import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.codegen.AbstractXmlGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

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
 * @CreateDate 2018-09-27 下午2:07
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public class TestGenerator extends org.mybatis.generator.codegen.AbstractJavaClientGenerator
{

	private Logger logger = LoggerFactory.getLogger(TestGenerator.class);

	public TestGenerator()
	{
		super(true);

	}

	public TestGenerator(boolean requiresXMLGenerator)
	{
		super(requiresXMLGenerator);
	}

	@Override
	public AbstractXmlGenerator getMatchedXMLGenerator()
	{
		//TODO 暂未实现 by hanxu at 18-9-27-下午2:08
		logger.warn("com.gfyt.core.storage.db.generator.TestGenerator.getMatchedXMLGenerator()==>方法暂未实现 by hanxu at 18-9-27-下午2:08");
		return null;
	}

	@Override
	public List<CompilationUnit> getCompilationUnits()
	{
		//TODO 暂未实现 by hanxu at 18-9-27-下午2:08
		logger.warn("com.gfyt.core.storage.db.generator.TestGenerator.getCompilationUnits()==>方法暂未实现 by hanxu at 18-9-27-下午2:08");
		return null;
	}
}
