package tech.shunzi.common.config.application.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Version:v1.0 (description:  ) Date:2018/1/15 0015  Time:23:08
 */
@Component
public class DemoPublisher {

	@Autowired
	private ApplicationContext applicationContext;

	public void publish(String msg) {
        System.out.println("Before publishing event****************************");
		applicationContext.publishEvent(new DemoEvent(this,msg));
        System.out.println("After publishing event*****************************");
	}

}
