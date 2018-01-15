package tech.shunzi.common.config.application.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Version:v1.0 (description:  ) Date:2018/1/15 0015  Time:22:53
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	@Override
	public void onApplicationEvent(DemoEvent event) {
		String message = event.getMessage();

		System.out.println("我 bean-demoListener 接收到了 bean-demoPublisher 发布的消息 " + message);
	}
}
