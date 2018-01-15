package tech.shunzi.common.config.application.event;

import org.springframework.context.ApplicationEvent;

/**
 * Version:v1.0 (description: Spring的事件为 Bean 与 Bean之间的消息通信提供了支持 )
 * 流程如下：
 * 1、自定义事件，继承 ApplicationEvent。需要定义构造方法并调用父类构造方法
 * 2、定义事件监听器，实现 ApplicationListener<监听的自定义事件类>。
 * 3、使用容器发布事件。ApplicationContext.publishEvent(自定义事件的实体类)
 *
 * Date:2018/1/15 0015  Time:22:49
 */
public class DemoEvent extends ApplicationEvent {

	private String message;

	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the component that published the event (never {@code null})
	 */
	public DemoEvent(Object source,String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
