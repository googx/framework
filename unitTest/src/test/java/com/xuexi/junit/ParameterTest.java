package com.xuexi.junit;

import java.util.*;
import java.lang.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
 * @CreateDate 2018-10-13 下午3:36
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
@RunWith(Parameterized.class)
public class ParameterTest
{
	private final Logger logger = LoggerFactory.getLogger(ParameterTest.class);
	// 2.声明变量存放预期值和测试数据
	private String firstName;
	private String lastName;

	//3.声明一个返回值 为Collection的公共静态方法，并使用@Parameters进行修饰

	@Parameterized.Parameters
	public static List<Object[]> param()
	{
		// 这里我给出两个测试用例
		return Arrays.asList(new Object[][] { { "Mike", "Black" }, { "Cilcln", "Smith" } ,{ "han", "xu" } ,{ "hx", "940929" } });
	}

	//4.为测试类声明一个带有参数的公共构造函数，并在其中为之声明变量赋值
	public ParameterTest(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// 5. 进行测试，发现它会将所有的测试用例测试一遍
	@Test
	public void test()
	{
		String name = firstName + " " + lastName;
		logger.info("test()==>"+name);

		assertThat("Mike Black", is(name));
	}

}
