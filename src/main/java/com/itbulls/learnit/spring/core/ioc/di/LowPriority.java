package com.itbulls.learnit.spring.core.ioc.di;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class LowPriority implements Priority {

	@Override
	public int getPriorityRank() {
		return 3;
	}

}
