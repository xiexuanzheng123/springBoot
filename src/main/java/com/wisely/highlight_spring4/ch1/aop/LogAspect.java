package com.wisely.highlight_spring4.ch1.aop;
import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 
 * @author CN17222
 *	编写切面
 */
@Aspect//声明是一个切面
@Component//让此切面成为Spring容器管理的Bean

public class LogAspect {
	@Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")//通过@PointCut声明切点
	public void annotationPointCut() {
		
	}
	
	@After("annotationPointCut()")//使用After定义建言（advice），可以直接将拦截规则作为参数，拦截参数称为切点（PointCut）
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截 " + action.name());//通过反射可获得注解上的属性，然后做日志记录相关的操作，
	}

	@Before("annotationPointCut()")//通过@Before注解声明一个建言
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则拦截 " + method.getName());
	}
}
