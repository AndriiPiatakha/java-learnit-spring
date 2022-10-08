package com.itbulls.learnit.spring.core.ioc.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Message {

}
