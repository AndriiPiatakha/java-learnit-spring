package com.itbulls.learnit.spring.core.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("masterProductBean")
public class MasterProduct implements Product {

}
