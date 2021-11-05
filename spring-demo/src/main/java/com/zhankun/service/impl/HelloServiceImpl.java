package com.zhankun.service.impl;

import com.zhankun.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhankun
 * @date 2021-10-29 17:58:46
 */
public class HelloServiceImpl implements HelloService {
	@Override
	public String getName(String name) {
		System.out.println("hello, 我的名字是: " + name + ";" + "我这个方法是有切面的");
		return "success: " + name;
	}

	@Override
	@Transactional
	public String findName(String name) {
		System.out.println("我这个方法没有切面");
		return "我是find方法";
	}
}
