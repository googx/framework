package com.fraw.junit.test.spring.core;

import java.io.File;
import java.util.*;
import java.lang.*;

import com.fraw.junit.test.spring.SprintSuite;
import org.junit.Test;
import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 * @CreateDate 2018-10-13 下午5:06
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public class BatchSuiteTest
{
	private final Logger logger = LoggerFactory.getLogger(BatchSuiteTest.class);

	@Test
	public void test() throws InitializationError
	{
		//TODO 通过这种方式来动态添加类,可以是可以,但是没办法和idea的显示联动,难道要通过改动junit源码,来植入自己的代码方式嘛,不知道还有没有更好的办法..

		Runner runner = null;
		Class<?> clazz = null;
		BatchSuiteTest test = new BatchSuiteTest();
		List<Class> classes = this.scanPackage();
		Suite suite = test.createSuite(classes.toArray(new Class[]{}));
		RunNotifier runNotifier = new RunNotifier();

		suite.run(runNotifier);
	}

	public RunnerBuilder getParentRunnerBuilder()
	{
		return new AllDefaultPossibilitiesBuilder(true);
	}

	/**
	 * 通过扫描testCase包,来获取所有的用例.
	 *
	 * @return
	 */
	public List<Class> scanPackage()
	{
		Package aPackage = SprintSuite.class.getPackage();
		List<Class> classes = this.searchClass(aPackage.getName());
		Class[] classes1=(Class[]) classes.toArray(new Class[]{});
		for (Class item : classes1)
		{
			Class superclass = item.getSuperclass();
			if(superclass!=null&& superclass!=BaseSpringTester.class){
				classes.remove(item);
			}
		}
		return classes;
	}

	public List<Class> searchClass(String basePack)
	{
		List<String> classPaths = new ArrayList<String>();
		//包名
		//先把包名转换为路径,首先得到项目的classpath
		String classpath = BatchSuiteTest.class.getResource("/").getPath();
		//然后把我们的包名basPach转换为路径名
		basePack = basePack.replace(".", File.separator);
		//然后把classpath和basePack合并
		String searchPath = classpath + basePack;
		doPath(classPaths,new File(searchPath));
		//这个时候我们已经得到了指定包下所有的类的绝对路径了。我们现在利用这些绝对路径和java的反射机制得到他们的类对象
		List<Class> allclass=new ArrayList<>();
		for (String item : classPaths)
		{

			String packageClassName = dolinux(classpath,item);
			//search-class\target\classes\com\baibin\search\a\A.class 这样的绝对路径转换为全类名com.baibin.search.a.A
			//s = s.replace(classpath.replace("/", "\\").replaceFirst("\\\\", ""), "").replace("\\", ".").replace(".class", "");
			Class cls = null;
			try
			{
				cls = Class.forName(packageClassName);
			}
			catch (ClassNotFoundException e)
			{
				logger.error("ErrorMessage", e);
				e.printStackTrace();
			}
			allclass.add(cls);
		}
		return allclass;
	}

	public String dolinux(String classpath,String filepath)
	{
		///media/hanxu/d/projectManagement/code/develop/framework/unitTest/target/test-classes/com/fraw/junit/test/spring/testCase/TestServiceTest.class
		String replace = filepath.replace(classpath, "");
		replace=replace.replace("/","." );
		return replace.replace(".class","");
	}


	/**
	 * 该方法会得到所有的类，将类的绝对路径写入到classPaths中
	 *
	 * @param file
	 */
	private void doPath(List<String> classpath, File file)
	{
		if(file.isDirectory())
		{ //文件夹
			//文件夹我们就递归
			File[] files = file.listFiles();
			for (File f1 : files)
			{
				doPath(classpath,f1);
			}
		}
		else
		{ //标准文件
			//标准文件我们就判断是否是class文件
			if(file.getName().endsWith(".class"))
			{
				//如果是class文件我们就放入我们的集合中。
				classpath.add(file.getPath());
			}
		}
	}

	/**
	 * @param clazzArray
	 * @return
	 * @throws InitializationError
	 */
	public Suite createSuite(Class... clazzArray) throws InitializationError
	{
		return new Suite(this.getParentRunnerBuilder(), clazzArray);
	}
}
