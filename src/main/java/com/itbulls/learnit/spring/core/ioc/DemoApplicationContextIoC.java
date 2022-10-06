package com.itbulls.learnit.spring.core.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplicationContextIoC {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean by ID
		User user1 = context.getBean("userBean", User.class);
		
		// get bean by name
		User user2 = context.getBean("user", User.class);
		
		System.out.println("user1 = " + user1);
		System.out.println("user2 = " + user2);
		System.out.println("user1 == user2: " + (user1 == user2));

	}

}
