package tech.shunzi.common.config.bean.lifetime;

/**
 * Version:v1.0 (description:  ) Date:2018/1/15 0015  Time:22:18
 */
public class BeanWayService {

	public void init() {
		System.out.println("@Bean-init-method");
	}

	public BeanWayService() {
		super();
		System.out.println("初始化构造函数-BeanWayService");
	}

	public void destroy() {
		System.out.println("@Bean-destroy-method");
	}

}
