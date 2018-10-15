package com.fraw.junit.test.spring.core;

import java.util.*;
import java.lang.*;

import com.gfyt.core.bean.entity.core.BaseResult;
import com.gfyt.core.service.test.Test1Service;
import com.gfyt.core.web.MainStarter;
import com.gfyt.core.web.TestController;
import org.apache.commons.lang3.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <b>功能说明:</b><p>
 * 获取启动类，加载配置，确定装载 Spring 程序的装载方法，它回去寻找 主配置启动类（被 @SpringBootApplication 注解的）
 * </p></br> <b>设计思想、目的:</b><p>
 * 一些说明写这里
 * </p></br><b>设计缺陷: </b>
 * <p>
 * 一些说明写这里
 * </p>
 *
 * @author hanxu
 * @version 1.0
 * @CreateDate 2018-10-13 下午4:09
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
@SpringBootTest(classes = MainStarter.class)
@RunWith(SpringRunner.class)
public class BaseSpringTester
{
}
