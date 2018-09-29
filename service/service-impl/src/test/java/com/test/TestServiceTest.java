package com.test;

import com.gfyt.core.service.test.TestService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

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
 * @CreateDate 2018-09-29 下午5:42
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public class TestServiceTest
{
	private final Logger logger = LoggerFactory.getLogger(TestServiceTest.class);

	@Autowired
	TestService service;

	@Test
	public void testAdd(){
		com.gfyt.core.bean.entity.Test testentity=new com.gfyt.core.bean.entity.Test();

		service.save(testentity);
	}
}
