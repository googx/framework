package com.gfyt.core.web;

import com.gfyt.core.bean.entity.Test;
import com.gfyt.core.bean.entity.core.BaseResult;
import com.gfyt.core.service.test.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
 * @CreateDate 2018-09-21 下午5:46
 * @Encoding UTF-8
 * @Version 1.0
 * @NeedThreadSave false
 * @WebSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
@Controller
@RequestMapping("/test")
public class TestController
{
	private final Logger logger = LoggerFactory.getLogger(TestController.class);
	@Autowired
	private TestService testService;

	@RequestMapping(value = "/v1")
	public ResponseEntity test(HttpServletRequest httpRequest, HttpServletResponse httpResponse, @RequestBody Test entity) throws Exception
	{
		BaseResult<Integer> save = testService.save(entity);
		save.get();
		logger.info("test()==>" + save.get());

		ResponseEntity<Test> ok = ResponseEntity.ok(entity);
		//.w.s.m.s.DefaultHandlerExceptionResolver : Failed to write HTTP message: org.springframework.http.converter.HttpMessageNotWritableException:
		// No converter found for return value of type: class com.gfyt.core.bean.entity.core.FinalResult
		//		ResponseEntity<BaseResult> ok1 = ResponseEntity.ok(save);
		return ok;
	}

}
