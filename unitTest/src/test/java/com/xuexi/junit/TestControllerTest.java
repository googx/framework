package com.xuexi.junit;

import static org.slf4j.LoggerFactory.getLogger;

import java.lang.*;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.slf4j.Logger;

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
 * @CreateDate 2018-10-13 下午3:21
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public class TestControllerTest
{
	private Logger logger= getLogger(TestControllerTest.class);
//	JUnit中的注解
//
//	@BeforeClass：针对所有测试，只执行一次，且必须为static void
//	@Before：初始化方法，执行当前测试类的每个测试方法前执行。
//	@Test：测试方法，在这里可以测试期望异常和超时时间
//	@After：释放资源，执行当前测试类的每个测试方法后执行
//	@AfterClass：针对所有测试，只执行一次，且必须为static void
//	@Ignore：忽略的测试方法（只在测试类的时候生效，单独执行该测试方法无效）
//	@RunWith:可以更改测试运行器 ，缺省值 org.junit.runner.Runner
//
//	一个单元测试类执行顺序为：
//
//	@BeforeClass –> @Before –> @Test –> @After –> @AfterClass
//
//	每一个测试方法的调用顺序为：
//
//	@Before –> @Test –> @After

	@Before
	public void setUp() throws Exception {
		logger.info("setUp()==>");

		TimeUnit.MILLISECONDS.sleep(500);
	}

	@After
	public void tearDown() throws Exception {
		logger.info("tearDown()==>");

	}

	@Test(timeout = 2000,expected = NullPointerException.class)
	public void test1() throws InterruptedException
	{
		logger.info("test1()==>bef");

		TimeUnit.MILLISECONDS.sleep(500);
		logger.info("test1()==>aft");
		throw new NullPointerException();

	}
}