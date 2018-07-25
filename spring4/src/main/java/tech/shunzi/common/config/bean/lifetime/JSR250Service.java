package tech.shunzi.common.config.bean.lifetime;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Version:v1.0 (description:  ) Date:2018/1/15 0015  Time:22:21
 */
public class JSR250Service {

	// 该注解表明 该方法在构造函数之后执行
	@PostConstruct
	public void init(){
		System.out.println("jsr250-init-method");
	}

	public JSR250Service() {
		super();
		System.out.println("初始化构造函数-JSR250WayService");
	}

	// 该注解表明 该方法在Bean销毁之前执行
	@PreDestroy
	public void destroy() {
		System.out.println("jsr250-destroy-method");
	}
}
