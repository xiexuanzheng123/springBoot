package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;;
@Service

public class UseFunctionService {
	@Autowired //使用@Autowired将functionService的实体Bean注入到UseFunctionService中，让UseFunction具备FunctionService的功能
	FunctionService functionService;
	
	public String SayHello(String word) {
		return functionService.sayHello(word);
	}
}
