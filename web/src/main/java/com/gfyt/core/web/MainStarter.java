package com.gfyt.core.web;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

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
 * @CreateDate 2018-09-25 下午3:29
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
@SpringBootApplication
@ComponentScan("com.gfyt")
//"com.gfyt.core.storage.db.api",
@MapperScan(value = {"com.gfyt.core.storage.db.api"})
public class MainStarter
{
	private final Logger logger = LoggerFactory.getLogger(MainStarter.class);

	public static void main(String[] args)
	{
		//		可以通过builder来定制spring的启动流程,提供了各种监听器了,不再需要像以前一样自己实现一套了.
		//		SpringApplicationRunListener
		//		SpringApplicationBuilder builder;
		SpringApplication.run(MainStarter.class, args);

	}
}
