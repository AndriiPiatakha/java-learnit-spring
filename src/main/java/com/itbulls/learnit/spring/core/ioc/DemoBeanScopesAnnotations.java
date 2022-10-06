package com.itbulls.learnit.spring.core.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoBeanScopesAnnotations {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext();
		context.scan("com.itbulls.learnit.spring.core.ioc");
		context.refresh();

		User2 user1 = context.getBean("user", User2.class);
		User2 user2 = context.getBean("user", User2.class);

		System.out.println("user1 == user2: " + (user1 == user2));
		
		User3 user3 = context.getBean("userPrototype", User3.class);
		User3 user4 = context.getBean("userPrototype", User3.class);
		
		System.out.println("user3 == user4: " + (user3 == user4));
		
	}

}
