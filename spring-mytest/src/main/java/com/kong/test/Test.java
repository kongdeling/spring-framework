package com.kong.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user = classPathXmlApplicationContext.getBean("user", User.class);
		user.sayHello();
	}
}
