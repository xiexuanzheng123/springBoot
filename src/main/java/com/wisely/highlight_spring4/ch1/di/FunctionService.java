package com.wisely.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;

@Service//ʹ��@Serviceע�⣬������ǰFunctionService����Spring�����һ��Bean

public class FunctionService {
	public String sayHello(String word) {
		return "Hello " + word + " !";
	}
}
