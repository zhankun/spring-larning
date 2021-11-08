package com.zhankun;

import com.zhankun.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhankun
 * @date 2021-10-29 17:50:52
 */
public class MyTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		HelloService helloService = (HelloService) context.getBean("helloService");
//		System.out.println(helloService.getName("hello"));
		System.out.println("----------我是无情的分割线----------");
//		helloService.findName("test");
//		TestAopService testAopService = context.getBean(TestAopService.class);
//		testAopService.testAop();
		helloService.testTransactional("啦啦啦啦啦啦啦啦");
	}
}
