package tech.shunzi.demo.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Version:v1.0 (description:  ) Date:2018/1/27 0027  Time:21:24
 */
public class ConditionDemoRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConditionConfig.class);

		ListService listService = context.getBean(ListService.class);

		System.out.println(
				context.getEnvironment().getProperty("os.name") + "系统下的列表命令为" + listService
						.showListCmd());
	}
}
