package tech.shunzi.demo.withoutDIAnno;


/**
 * Version:v1.0 (description: 不使用 @Service 注解 )
 *
 * Date:2017/12/29 0029  Time:23:50
 */
public class SayHelloService {

	public String sayHello(String word) {
		return "Hello " + word + " !";
	}

}
