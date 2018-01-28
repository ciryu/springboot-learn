package tech.shunzi.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Version:v1.0 (description:  ) Date:2018/1/28 0028  Time:18:28
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

	private static final String MSG = "world";

	private String msg = MSG;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
