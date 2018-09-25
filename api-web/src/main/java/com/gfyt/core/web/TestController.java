package com.gfyt.core.web;

import com.gfyt.core.service.BaseService;
import com.gfyt.core.storage.entity.AbstoryFileEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
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
	//	private final Logger logger = LoggerFactory.getLogger(TestController.class);
	BaseService<AbstoryFileEntity> baseService;

	@RequestMapping(value = "/v1")
	public String test(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws Exception
	{
		return  "hello,core";

	}
			
}
