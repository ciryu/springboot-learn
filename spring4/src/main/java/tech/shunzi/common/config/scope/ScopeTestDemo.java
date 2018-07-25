package tech.shunzi.common.config.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Version:v1.0 (description:  ) Date:2018/1/15 0015  Time:21:20
 */
public class ScopeTestDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ScopeConfig.class);

		DemoSingletonService demoSingletonService1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService demoSingletonService2 = context.getBean(DemoSingletonService.class);

		DemoPrototypeService demoPrototypeService1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService demoPrototypeService2 = context.getBean(DemoPrototypeService.class);

		System.out
				.println("单例 => s1与s2是否相等？" + demoSingletonService1.equals(demoSingletonService2));
		System.out
				.println("多例 => p1与p2是否相等？" + demoPrototypeService1.equals(demoPrototypeService2));
	}
}
