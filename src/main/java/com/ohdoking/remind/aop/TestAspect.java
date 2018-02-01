package com.ohdoking.remind.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component 
@Aspect 
@Order(Ordered.LOWEST_PRECEDENCE)
public class TestAspect {

}
