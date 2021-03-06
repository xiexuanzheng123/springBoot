package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//声明当前类是一个配置类,相当于一个Spring配置的xml文件
@ComponentScan("com.wisely.highlight_spring4.ch1.di")
//自动扫描包名下所有使用@Service、@Component、@Repository、@Controller的类并注册为Bean

public class DiConfig {

}
