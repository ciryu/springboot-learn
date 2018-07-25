package tech.shunzi.common.config.springEL;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Version:v1.0 (description:  ) Date:2018/1/15 0015  Time:22:01
 */
public class DemoRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				Elconfig.class);

		Elconfig resourceService = context.getBean(Elconfig.class);

		resourceService.outputResource();

		context.close();
	}
}
