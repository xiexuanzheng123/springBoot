package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		//ʹ��AnnotationConfigApplicationContext��ΪSpring��������������һ����������Ϊ����
		
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);//����������õ�UseFunctionService��Bean
		System.out.println(useFunctionService.SayHello("di"));
		context.close();
	}
}
