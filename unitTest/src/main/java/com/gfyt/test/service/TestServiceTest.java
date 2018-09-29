package com.test;

import com.gfyt.core.service.test.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <b>功能说明:</b><p>
 * 使用springboot提供的单元测试插件,来保证每次更新代码,单元测试能跑通,可以在测试环境先避免一大部分bug
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
@SpringBootTest
@RunWith(SpringRunner.class)
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
