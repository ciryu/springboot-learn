package tech.shunzi.demo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Version:v1.0 (description:  ) Date:2018/1/27 0027  Time:21:58
 */
public class Main {

	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		DemoService demoService = context.getBean(DemoService.class);

		demoService.outputResult();

		context.close();
	}
}
