package tech.shunzi.demo.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Version:v1.0 (description:  ) Date:2018/1/27 0027  Time:21:18
 */
@Configuration
public class ConditionConfig {

	@Bean
	@Conditional(WindowsCondition.class)
	public ListService windowsListService() {
		return new WindowsListService();
	}

	@Bean
	@Conditional(LinuxCondition.class)
	public ListService linuxListService() {
		return new LinuxListService();
	}
}
