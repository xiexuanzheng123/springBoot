package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/**
 * 
 * @author CN17222
 *	配置类
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy//使用@EnableAspectJAutoProxy注解开启Spring对AspectJ代理的支持

public class AopConfig {

}
