package tech.shunzi.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Version:v1.0 (description:  ) Date:2018/1/27 0027  Time:23:58
 */
@Component
@ConfigurationProperties(prefix = "author")
@PropertySource("classpath:author.properties")
public class AuthorSettings {

	private String name;

	private Long age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}
}
