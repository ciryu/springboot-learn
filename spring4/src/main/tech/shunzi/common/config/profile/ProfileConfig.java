package tech.shunzi.common.config.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Version:v1.0 (description:  ) Date:2018/1/15 0015  Time:22:37
 */
@Configuration
public class ProfileConfig {

	@Bean
	@Profile("dev")
	public DemoBean prodDemoBean() {
		return new DemoBean("from development profile");
	}

	@Bean
	@Profile("prod")
	public DemoBean devDemoBean() {
		return new DemoBean("from production profile");
	}

}
