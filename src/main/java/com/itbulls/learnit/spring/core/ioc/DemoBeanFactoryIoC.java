package com.itbulls.learnit.spring.core.ioc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoBeanFactoryIoC {

	public static void main(String[] args) {
	    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
	    XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
	    Resource resource = new ClassPathResource("applicationContext.xml");
	    beanDefinitionReader.loadBeanDefinitions(resource);
	    
	    // get bean by ID
	    User user1 = beanFactory.getBean("userBean", User.class);
	    System.out.println(user1);
	    
	    // get bean by name
	    User user2 = beanFactory.getBean("user", User.class);
	    System.out.println(user2);
	    
	    System.out.println("user1 == user2: " + (user1 == user2));
	    
	    	    
	}

}
