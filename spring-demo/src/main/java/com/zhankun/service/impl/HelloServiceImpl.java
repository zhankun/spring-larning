package com.zhankun.service.impl;

import com.zhankun.service.HelloService;
import com.zhankun.service.TestAopService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhankun
 * @date 2021-10-29 17:58:46
 */
public class HelloServiceImpl implements HelloService {

	private TestAopService testAopService;

	public TestAopService getTestAopService() {
		return testAopService;
	}

	public void setTestAopService(TestAopService testAopService) {
		this.testAopService = testAopService;
	}

	@Override
	public String getName(String name) {
		System.out.println("hello, 我的名字是: " + name + ";" + "我这个方法是有切面的");
		return "success: " + name;
	}

	@Override
	public String findName(String name) {
		System.out.println("我这个方法没有切面");
		return "我是find方法";
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void testTransactional(String name) {
		System.out.println("测试事务........");
		// 在调用另一个方法的事务，propagation = Propagation.REQUIRES_NEW。会挂起
		// 当前事务，并且新开一个事务
		testAopService.testAop();
		// 调用这个，是没有事务的
		testAAA();
	}

	@Transactional(rollbackFor = Exception.class)
	public void testAAA() {
		System.out.println("我会有事务吗?");
	}
}
