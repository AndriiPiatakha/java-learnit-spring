package com.itbulls.learnit.spring.core.ioc.di;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class UserMessenger {
	
	private Message message;

	@Lookup
	public Message getMessage() {
		return null;
	}
	
}
