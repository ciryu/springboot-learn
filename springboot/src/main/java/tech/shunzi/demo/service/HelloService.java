package tech.shunzi.demo.service;

/**
 * Version:v1.0 (description:  ) Date:2018/1/28 0028  Time:18:30
 */
public class HelloService {

	private String msg;

	public String sayHello() {
		return "Hello " + msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
