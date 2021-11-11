package com.zhankun.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhankun
 * @date 2021-11-04 14:26:05
 */
public class TestAopService {

	@Transactional(propagation = Propagation.NESTED, rollbackFor = Exception.class)
	public void testAop() {
		System.out.println("我是没有接口的service");

/*		if (true) {
			throw new NullPointerException();
		}*/
	}
}
