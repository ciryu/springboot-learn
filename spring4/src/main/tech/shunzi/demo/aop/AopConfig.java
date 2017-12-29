package tech.shunzi.demo.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Version:v1.0 (description: Aop配置类  )
 * @EnableAspectJAutoProxy 注解开启Spring对AspectJ的支持
 * AspectJ 第三方 面向切面编程 的框架
 * 和Spring  AOP 本身的动态代理机制作比较
 * 参考博文:http://blog.csdn.net/a128953ad/article/details/50509437
 * Date:2017/12/30 0030  Time:01:03
 */
@Configuration
@ComponentScan("tech.shunzi.demo.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
