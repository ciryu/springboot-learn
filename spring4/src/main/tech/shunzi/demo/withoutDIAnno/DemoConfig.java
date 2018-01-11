package tech.shunzi.demo.withoutDIAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Version:v1.0 (description: 使用Java配置Spring相关 不使用包扫描 )
 * @Configuration 该注解声明当前类是一个配置类 意味着该类里可能有0个或多个 @Bean 注解
 *
 * Date:2017/12/30 0030  Time:00:13
 */
@Configuration
public class DemoConfig {

	/**
	 * 使用 @Bean 注解表明该类返回的是一个 Bean,对应的name为方法名 sayHelloService
	 * @return SayHelloService
	 */
	@Bean
	public SayHelloService sayHelloService() {
		return new SayHelloService();
	}

	@Bean
	public UseSayHelloService useSayHelloService() {
		System.out.println("依赖注入-无参调用");
		UseSayHelloService useSayHelloService = new UseSayHelloService();
		// 调用sayHelloService()注入对应的 sayHelloService
		useSayHelloService.setSayHelloService(sayHelloService());
		return useSayHelloService;
	}

	/**
	 * 通过使用参数注入sayHelloService到对应的Bean
	 * 注：优先于上文中无参的函数的调用。
	 * @param sayHelloService 参数
	 * @return UseSayHelloSayService
	 */
	@Bean
	public UseSayHelloService useSayHelloService(SayHelloService sayHelloService) {
		System.out.println("依赖注入-有参调用");
		UseSayHelloService useSayHelloService = new UseSayHelloService();
		useSayHelloService.setSayHelloService(sayHelloService);
		return useSayHelloService;
	}

}
