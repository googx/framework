package com.xuexi.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
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
 * @CreateDate 2018-10-13 下午3:32
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
@RunWith(Suite.class)
@SuiteClasses({TestControllerTest.class,TestControllerTest2.class})
public class TestControllerTestSuit
{
	private final Logger logger = LoggerFactory.getLogger(TestControllerTestSuit.class);
	/**
	 * 测试套件的入口类只是组织测试类一起进行测试，无任何测试方法，
	 */
}
