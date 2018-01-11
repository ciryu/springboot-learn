package tech.shunzi.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Version:v1.0 (description: 使用Java配置Spring相关，替代Spring配置文件  )
 * @Configuration 该注解声明当前类是一个配置类
 * @ComponentScan 自动扫描指定名字的包下对应的注入Bean的注解并注册为Bean
 *
 * Date:2017/12/30 0030  Time:00:13
 */
@Configuration
@ComponentScan("tech.shunzi.demo")
public class DemoConfig {

}
