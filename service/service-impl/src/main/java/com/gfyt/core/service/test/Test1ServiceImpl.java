package com.gfyt.core.service.test;

import com.gfyt.core.bean.entity.Test1;
import com.gfyt.core.bean.entity.core.BaseResult;
import com.gfyt.core.bean.entity.core.FinalResult;
import com.gfyt.core.storage.db.api.Test1Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
 * @CreateDate 2018-09-25 上午9:27
 * @Encoding UTF-8
 * @Version 1.0
 * @NeedThreadSave false
 * @WebSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
@Service
public class Test1ServiceImpl implements Test1Service
{
	Logger logger = LoggerFactory.getLogger(Test1ServiceImpl.class);
	@Autowired
	Test1Mapper testDao;

	Test1ServiceImpl()
	{
		logger.info("com.gfyt.core.service.test.TestServiceImpl()==>启动测试");
		System.out.println("com.gfyt.core.service.test.TestServiceImpl()==>启动测试");

	}

	@Override
	public BaseResult save(Test1 entity)
	{
		int insert = testDao.insertSelective(entity);
		logger.warn("com.gfyt.core.service.test.TestServiceImpl.save()==>方法暂未实现 by hanxu at 18-9-27-下午2:45");
		return new FinalResult<Integer>(insert);
	}

	@Override
	public BaseResult update(Test1 entity)
	{
		//TODO 暂未实现 by hanxu at 18-9-27-下午2:45
		logger.warn("com.gfyt.core.service.test.TestServiceImpl.update()==>方法暂未实现 by hanxu at 18-9-27-下午2:45");
		return null;
	}

	@Override
	public BaseResult delete(Test1 entity)
	{
		//TODO 暂未实现 by hanxu at 18-9-27-下午2:45
		logger.warn("com.gfyt.core.service.test.TestServiceImpl.delete()==>方法暂未实现 by hanxu at 18-9-27-下午2:45");
		return null;
	}

	@Override
	public BaseResult<Test1> queryOneByPrimary(Test1 entity)
	{
		Test1 test = testDao.selectByPrimaryKey(entity.getId());
		FinalResult<Test1> testFinalResult = new FinalResult<>(test);
		return testFinalResult;
	}

	@Override
	public BaseResult<List<Test1>> queryList(Test1 entity)
	{
		//暂未实现 by hanxu at 18-10-13-下午4:33
		return null;
	}

}
