package tech.shunzi.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Version:v1.0 (description: Demo运行器 )
 * Date:2017/12/30 0030  Time:00:15
 * 步骤如下：
 * 1、创建对应的Spring容器；
 * 2、Spring容器加载对应的配置文件（此处使用Java配置，即DemoConfig.class）来创建对应的Bean；
 * 3、执行对应的目标方法（调用容器Bean对应的方法）
 * 4、关闭容器时释放容器资源
 */
public class DemoRunner {

	public static void main(String[] args) {

		// 使用 AnnotationConfigApplicationContext 作为Spring容器，并接受一个配置类作为参数
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				DemoConfig.class);

		// 获得容器中对应的 Service 对应的 Bean
		UseSayHelloService useSayHelloService = applicationContext.getBean(UseSayHelloService.class);

		// 执行 Bean 对应的方法
		System.out.println(useSayHelloService.sayHello("spring4-demo"));

		// 释放容器资源
		applicationContext.close();
	}
}
