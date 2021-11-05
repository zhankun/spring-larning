package com.zhankun.service;

import org.springframework.stereotype.Service;

/**
 * @author zhankun
 * @date 2021-11-04 14:26:05
 */
@Service
public class TestAopService {

	public void testAop() {
		System.out.println("我是没有接口的service");
	}
}
