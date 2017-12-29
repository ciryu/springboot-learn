package tech.shunzi.demo.aop;

import org.springframework.stereotype.Service;

/**
 * Version:v1.0 (description: 使用自定义的 Action 注解并指定对应的 name() )
 *
 * Date:2017/12/30 0030  Time:00:53
 */
@Service
public class DemoAnnotationService {

	@Action(name = "注解式拦截的Add操作")
	public void add() {System.out.println("注解式Add========>");}
}
