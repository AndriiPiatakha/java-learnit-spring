package com.itbulls.learnit.spring.core.ioc.di;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Role adminRole() {
		return new Role("ADMIN_ROLE");
	}
	
	@Bean
	public User adminUser() {
		return new User(adminRole());
	}
	
	@Bean
	public User adminUser2() {
		User user = new User();
		user.setRole(adminRole());
		return user;
	}

	@Bean
	public List<String> orderIds() {
		return Arrays.asList("id1", "id2", "id3");
	}
	
	@Bean
	public User4 userWithList() {
		return new User4(Arrays.asList("id1", "id2", "id3"));
	}
}
