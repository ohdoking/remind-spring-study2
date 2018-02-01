#Remind Spring

##개요

spring boot 를 사용하여 aop를 구현해본다.

##설명
###공부

#### @EnableAspectAutoProxy
- XML 기반의 ApplicationContext 설정에서의 <aop:aspectj-autoproxy />와 동일한 기능을 한다.

#### Aop 클래스만들기 
스프링 빈에 @Aspect를 명시하면 해당 빈이 Aspect로 작동한다.
클래스 레벨에 @Order를 명시하여 @Aspect 빈 간의 작동 순서를 정할 수 있다. int 타입의 정수로 순서를 정할 수 있는데 값이 낮을수록 우선순위가 높다. 기본값은 가장 낮은 우선순위를 가지는 Ordered.LOWEST_PRECEDENCE이다.
@Aspect가 명시된 빈에는 어드바이스(Advice)라 불리는 메써드를 작성할 수 있다. 대상 스프링 빈의 메써드의 호출에 끼어드는 시점과 방법에 따라 @Before, @After, @AfterReturning, @AfterThrowing, @Around 등을 명시할 수 있다.



## 참고

- http://jsonobject.tistory.com/247 [지단로보트의 블로그]


