package tech.shunzi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Version:v1.0 (description: 使用 @Autowired 将sayHelloService的实体 Bean 注入到该service中 )
 * 同样可实现该功能的额注解有 @Resources @Inject
 *
 * 参考博文：https://www.cnblogs.com/brant/p/5723921.html
 *          http://blog.csdn.net/u013474104/article/details/44352765/
 *
 * @Resources JSR-250 使用的是CommonAnnotationBeanPostProcessor来处理依赖注入，一般会指定一个name属性
 * 默认 autowired by field name
 * 如果 autowired by field name失败，会退化为 autowired by type
 * 可以 通过@Qualifier 显式指定 autowired by qualifier name
 * 如果 autowired by qualifier name失败，会退化为 autowired by field name。
 * 但是这时候如果 autowired by field name失败，就不会再退化为autowired by type了。
 * @Resources(name="beanName")
 *
 * @Inject JSR-300 同 @Autowired 基本一样，均使用 AutowiredAnnotationBeanPostProcessor来处理依赖注入
 * 默认 autowired by type
 * 可以 通过@Qualifier 显式指定 autowired by qualifier name。
 *
 * 关于 @Qualifier 注解，可以在 @Service("qualifierName") 对应的注入时 @Qualifier("qualifierName")
 *
 * @Autowired
 * @Qualifier(name="beanName")
 *
 * Date:2017/12/29 0029  Time:23:56
 */
@Service
public class UseSayHelloService {

	@Autowired
	private SayHelloService sayHelloService;

	public String sayHello(String word) {
		System.out.println("UserSayHelloService=========>");
		return sayHelloService.sayHello(word);
	}
}
