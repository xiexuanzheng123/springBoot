package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/**
 * 
 * @author CN17222
 *	������
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy//ʹ��@EnableAspectJAutoProxyע�⿪��Spring��AspectJ�����֧��

public class AopConfig {

}
