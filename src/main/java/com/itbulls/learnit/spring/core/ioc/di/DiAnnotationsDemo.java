package com.itbulls.learnit.spring.core.ioc.di;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DiAnnotationsDemo {
	
	@Autowired
    private List<Priority> priorities;
	
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext()) {
			context.scan("com.itbulls.learnit.spring.core.ioc.di");
			context.refresh();
			
			System.out.println("========== CONSTRUCTOR INJECTION DEMO ==========");
			User adminUser = context.getBean("adminUser", User.class);
			System.out.println(adminUser.getRole().getRoleName());
			
			System.out.println("========== SETTER INJECTION DEMO ==========");
			User adminUser2 = context.getBean("adminUser2", User.class);
			System.out.println(adminUser2.getRole().getRoleName());
			
			System.out.println("========== FIELD INJECTION DEMO ==========");
			User2 adminUser3 = context.getBean("user2", User2.class);
			System.out.println(adminUser3.getRole().getRoleName());
			
			System.out.println("========== QUALIFIER DEMO ==========");
			User3 adminUser4 = context.getBean("user3", User3.class);
			System.out.println(adminUser4.getRole().getClass());
			
			System.out.println("========== INJECT COLLECTION DEMO ==========");
			User4 user4 = context.getBean("user4", User4.class);
			System.out.println(user4.getOrderIds());
			
			User4 user5 = context.getBean("userWithList", User4.class);
			System.out.println(user5.getOrderIds());
			
			System.out.println("========== ORDERED COLLECTION DEMO ==========");
			var demo = context.getBean("diAnnotationsDemo", DiAnnotationsDemo.class);
			for (Priority priority : demo.priorities) {
				System.out.println(priority.getPriorityRank());
			}
			
			System.out.println("========== LOOKUP DEMO ==========");
			var userMessenger = context.getBean("userMessenger", UserMessenger.class);
			System.out.println("Compare two messages: " + (userMessenger.getMessage() == userMessenger.getMessage()));
			System.out.println(userMessenger.getMessage());
			
		} catch (BeansException | IllegalStateException e) {
			e.printStackTrace();
		}
	}

}
