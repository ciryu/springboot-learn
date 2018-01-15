package tech.shunzi.common.config.bean.lifetime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Version:v1.0 (description:  ) Date:2018/1/15 0015  Time:22:24
 */
@Configuration
@ComponentScan("tech.shunzi.common.config.bean.lifetime")
public class LifetimeConfig {

	// 通过使用Bean的属性进行配置
	@Bean(initMethod = "init",destroyMethod = "destroy")
	BeanWayService beanWayService() {
		return new BeanWayService();
	}

	@Bean
	JSR250Service jsr250Service() {
		return new JSR250Service();
	}
}
