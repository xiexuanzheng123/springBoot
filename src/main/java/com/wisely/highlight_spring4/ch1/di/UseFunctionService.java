package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;;
@Service

public class UseFunctionService {
	//@Autowired //ʹ��@Autowired��functionService��ʵ��Beanע�뵽UseFunctionService�У���UseFunction�߱�FunctionService�Ĺ���
	FunctionService functionService;
	
	public String SayHello(String word) {
		return functionService.sayHello(word);
	}
}
