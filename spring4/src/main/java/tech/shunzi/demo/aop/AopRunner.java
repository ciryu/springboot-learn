package tech.shunzi.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Version:v1.0 (description:  ) Date:2017/12/30 0030  Time:01:04
 */
public class AopRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				AopConfig.class);

		DemoAnnotationService demoAnnotationService = applicationContext.getBean(DemoAnnotationService.class);

		DemoMethodService demoMethodService = applicationContext.getBean(DemoMethodService.class);

		demoAnnotationService.add();

		demoMethodService.add();

		applicationContext.close();
	}
}
