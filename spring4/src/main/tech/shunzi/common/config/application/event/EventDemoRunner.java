package tech.shunzi.common.config.application.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Version:v1.0 (description:  ) Date:2018/1/15 0015  Time:23:13
 */
public class EventDemoRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				EventConfig.class);

		DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

		demoPublisher.publish("hello application event");

		context.close();
	}
}
