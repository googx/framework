package com.fraw.junit.test.spring.testCase;

import java.util.*;
import java.lang.*;

import com.fraw.junit.test.spring.core.BaseSpringTester;
import com.gfyt.core.bean.entity.Test1;
import com.gfyt.core.bean.entity.core.BaseResult;
import com.gfyt.core.service.test.Test1Service;
import com.gfyt.core.web.TestController;
import org.apache.commons.lang3.*;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
 * @CreateDate 2018-10-13 下午8:20
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
@WebMvcTest(TestController.class)
public class TestControllerTest extends BaseSpringTester
{
	private final Logger logger = LoggerFactory.getLogger(TestControllerTest.class);

	@Autowired
	private MockMvc mvc;

	@MockBean
	Test1Service service;

	public void setup()
	{
		//TODO 暂未实现 by hanxu at 18-10-13-下午8:22
		Test1 entity = new Test1();
		List returndata = new ArrayList<>();
		OngoingStubbing<BaseResult<Test1>> baseResultOngoingStubbing = Mockito.when(service.queryOneByPrimary(entity)).thenReturn(
				(BaseResult<Test1>) returndata);

	}

	@Test
	public void test() throws Exception
	{
		mvc.perform(MockMvcRequestBuilders.get("/emp")).andExpect(status().isOk()) // 期待返回状态吗码200
		   // JsonPath expression  https://github.com/jayway/JsonPath
		   // .andExpect(jsonPath("$[1].name").exists())
		   // 这里是期待返回值是数组，并且第二个值的 name 存在，所以这里测试是失败的
		   .andDo(print());
		// 打印返回的 http response 信息

	}

}
