package tech.shunzi.common.config.bean.lifetime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Version:v1.0 (description:  ) Date:2018/1/15 0015  Time:22:28
 */
public class LifetimeDemoRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				LifetimeConfig.class);
		BeanWayService beanWayService = context.getBean(BeanWayService.class);
		JSR250Service jsr250Service = context.getBean(JSR250Service.class);

		context.close();
	}

}
