package com.fraw.junit.test.spring.testCase;

import java.util.*;
import java.lang.*;

import com.fraw.junit.test.spring.core.BaseSpringTester;
import org.apache.commons.lang3.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockReset;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

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
 * @CreateDate 2018-10-13 下午11:43
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public class TestContorllerTest2 extends BaseSpringTester
{
	private final Logger logger = LoggerFactory.getLogger(TestContorllerTest2.class);
	@Autowired
	private WebApplicationContext ctx;
	private MockMvc mockMvc;

	/**
	 * 初始化 MVC 的环境https://blog.csdn.net/qq_35915384/article/details/80227297
	 */
	@Before
	public void before() { mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build(); }

	@Test
	public void listAll() throws Exception
	{
		mockMvc.perform(MockMvcRequestBuilders.get("/emp").accept(MediaType.APPLICATION_JSON_UTF8)).andExpect(MockMvcResultMatchers.status().isOk())
		       .andExpect(MockMvcResultMatchers.jsonPath("$[1].name").exists()).andDo(MockMvcResultHandlers.print());
//		这里是期待返回值是数组，并且第二个值的 name 存在
		; // 期待返回状态吗码200
	}
}
