package com.itbulls.learnit.spring.core.ioc.di;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class MediumPriority implements Priority {

	@Override
	public int getPriorityRank() {
		return 2;
	}

}
