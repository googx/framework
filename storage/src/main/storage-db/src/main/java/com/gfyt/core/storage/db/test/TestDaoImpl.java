package com.gfyt.core.storage.db.test;

import com.gfyt.core.bean.entity.BaseResult;
import com.gfyt.core.bean.entity.test.TestEntity;
import com.gfyt.core.storage.api.test.TestDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

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
 * @CreateDate 2018-09-25 下午12:04
 * @Encoding UTF-8
 * @Version 1.0
 * @NeedThreadSave false
 * @WebSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
@Repository
public class TestDaoImpl implements TestDao
{

	Logger logger = LoggerFactory.getLogger(TestDaoImpl.class);

	public TestDaoImpl()
	{
		logger.info("TestDaoImpl()==>启动测试TestDaoImpl");
		System.out.println("TestDaoImpl()==>启动测试TestDaoImpl");
	}

	@Override
	public BaseResult save(TestEntity entity)
	{
		//暂未实现 by hanxu at 18-9-25-下午12:04
		return null;
	}

	@Override
	public BaseResult update(TestEntity entity)
	{
		//暂未实现 by hanxu at 18-9-25-下午12:04
		return null;
	}

	@Override
	public BaseResult delete(TestEntity entity)
	{
		//暂未实现 by hanxu at 18-9-25-下午12:04
		return null;
	}

	@Override
	public BaseResult query(TestEntity entity)
	{
		//暂未实现 by hanxu at 18-9-25-下午12:04
		return null;
	}
}
