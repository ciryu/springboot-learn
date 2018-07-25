package tech.shunzi.demo;

import org.springframework.stereotype.Service;

/**
 * Version:v1.0 (description: @Service 注解表名该类为Spring容器管理的bean )
 * 同理 @Component @Repository @Controller实现同样的效果，但对应的场景不同。
 * @Componet 组件。无法划分具体层次时使用
 * @Service 服务层 业务逻辑层
 * @Repository 数据访问层，数据持久层 dao
 * @Controller MVC对应的展现层
 *
 * Date:2017/12/29 0029  Time:23:50
 */
@Service
public class SayHelloService {

	public String sayHello(String word) {
		return "Hello " + word + " !";
	}

}
