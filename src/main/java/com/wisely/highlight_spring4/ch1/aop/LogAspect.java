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
 *	��д����
 */
@Aspect//������һ������
@Component//�ô������ΪSpring���������Bean

public class LogAspect {
	@Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")//ͨ��@PointCut�����е�
	public void annotationPointCut() {
		
	}
	
	@After("annotationPointCut()")//ʹ��After���彨�ԣ�advice��������ֱ�ӽ����ع�����Ϊ���������ز�����Ϊ�е㣨PointCut��
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("ע��ʽ���� " + action.name());//ͨ������ɻ��ע���ϵ����ԣ�Ȼ������־��¼��صĲ�����
	}

	@Before("annotationPointCut()")//ͨ��@Beforeע������һ������
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("������������ " + method.getName());
	}
}
