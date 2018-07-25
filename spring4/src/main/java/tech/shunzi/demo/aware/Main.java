package tech.shunzi.demo.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Version:v1.0 (description:  ) Date:2018/1/18 0018  Time:21:05
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AwareConfig.class);

		AwareService awareService = context.getBean(AwareService.class);
		awareService.outputResult();

		context.close();
	}
}
