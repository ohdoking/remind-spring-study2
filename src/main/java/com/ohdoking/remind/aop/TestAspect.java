package com.ohdoking.remind.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@Aspect
@Order(Ordered.LOWEST_PRECEDENCE)
public class TestAspect {

	
	@Pointcut("execution(* com.ohdoking.remind.controller.*.*(..))")
	public void testPointcut(){
		System.out.println("pointcut!!");
	}
	@Before("execution(* com.ohdoking.remind.controller.*.*(..))")
	public void doSomethingBefore(JoinPoint joinPoint) {
		// 끼어들어 실행할 로직을 작성
		System.out.println("before!!");
	}

	@After("execution(* com.ohdoking.remind.controller.*.*(..))")
	public void doSomethingAfter(JoinPoint joinPoint) {
		// 끼어들어 실행할 로직을 작성
		System.out.println("after!!");
	}

	@AfterReturning(pointcut = "execution(* com.ohdoking.remind.controller.*.*(..))", returning = "result") 
	public void doSomethingAfterReturning(JoinPoint joinPoint, Object result) { 
		// 끼어들어
		
		System.out.println("toto!!");
		System.out.println((String)result);
	}
	
	@AfterThrowing(pointcut = "execution(* com.ohdoking.remind.controller.*.*(..))", throwing = "result") 
	public void doSomethingAfterThrowing(JoinPoint joinPoint, Object result) { 
		// 끼어들어
		
		System.out.println("throw!!");
		((Throwable)result).getMessage();
	
	}
																																										// 실행할
																																										// 로직을
	// 특정 어노테이션이 명시된 모든 메써드의 실행 전후로 끼어들 수 있다.
	@Around("@annotation(RequestMapping)") 
	public Object doSomethingAround(final ProceedingJoinPoint joinPoint) throws Throwable { 
		// 대상 메써드 실행 전 끼어들어 실행할 로직을 작성 
		Object result = joinPoint.proceed(); 
		// 대상 메써드 실행 후 끼어들어 실행할 로직을 작성, 리턴 값을 가공할 수 있다. 
		return result; 
	}

}
