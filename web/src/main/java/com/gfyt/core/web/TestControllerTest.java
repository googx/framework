package com.gfyt.core.web;

import com.gfyt.core.bean.entity.Test1;
import com.gfyt.core.bean.entity.core.BaseResult;
import com.gfyt.core.service.test.Test1Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.*;

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
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = MainStarter.class)
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ConfigurationBean.class)
public class TestControllerTest // extends BaseSpringTester
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

	/**
	 * 使用@WebMvcTest注解时，只有一部分的 Bean 能够被扫描得到，它们分别是：
	 *
	 *     @Controller
	 *     @ControllerAdvice
	 *     @JsonComponent
	 *     Filter
	 *     WebMvcConfigurer
	 *     HandlerMethodArgumentResolver
	 *     其他常规的@Component（包括@Service、@Repository等）Bean 则不会被加载到 Spring 测试环境上下文中。
	 *     所以我在上面使用了数据打桩，Mockito 在这篇文章最后一节
	 *
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception
	{
		Test1 test1 = new Test1();
		test1.setId(1);
		BaseResult<Test1> test1BaseResult = service.queryOneByPrimary(test1);
		//service 能正常注入,但是是个代理的空实现对象,返回结果为null
		ResultActions perform = mvc.perform(MockMvcRequestBuilders.get("/test/ping"));
		MvcResult mvcResult = perform.andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		int status = response.getStatus();
		ResultActions resultActions = perform.andExpect(status().isOk());// 期待返回状态吗码200
		resultActions.andDo(print());
		// JsonPath expression  https://github.com/jayway/JsonPath
		   // .andExpect(jsonPath("$[1].name").exists())
		   // 这里是期待返回值是数组，并且第二个值的 name 存在，所以这里测试是失败的
//		   .andDo(print());
		// 打印返回的 http response 信息

	}

}
