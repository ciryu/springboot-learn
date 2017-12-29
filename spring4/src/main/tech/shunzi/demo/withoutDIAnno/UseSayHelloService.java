package tech.shunzi.demo.withoutDIAnno;


/**
 * Version:v1.0 (description: 不使用 @Autowired 和 @Service)
 *
 * Date:2017/12/29 0029  Time:23:56
 */
public class UseSayHelloService {

	private SayHelloService sayHelloService;

	public String sayHello(String word) {
		System.out.println("UserSayHelloService=========>");
		return sayHelloService.sayHello(word);
	}

	public void setSayHelloService(SayHelloService sayHelloService) {
		this.sayHelloService = sayHelloService;
	}
}
