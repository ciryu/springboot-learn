package tech.shunzi.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Version:v1.0 (description: 定义切面 )
 *
 * @Aspect 声明一个切面  AspectJ
 * @Componet 使得切面由 Spring 容器管理
 * @PointCut 声明切点
 * @After 声明建言Advice，即对应的执行逻辑。并使用定义好的切点
 * @Before 声明建言Advice，此处demo直接使用了拦截规则作为参数(注意拦截参数的格式)
 *
 * Date:2017/12/30 0030  Time:00:55
 */
@Aspect
@Component
public class LogAspect {

	// 定义指定Action注解修饰的方法均为切点
	@Pointcut("@annotation(tech.shunzi.demo.aop.Action)")
	public void annotationPointCut(){}

	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {

		// 使用连接点获得对应的方法签名，包含 方法 和 返回值类型
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();

		// 获得拦截的方法
		Method method = signature.getMethod();

		// 由于定义注解时使用的是 @Retention(RetentionPolicy.RUNTIME)
		// 所以可以通过反射获取到对应的 注解  并使用相关的属性
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截：" + action.name());
	}

	@Before("execution( * tech.shunzi.demo.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则式拦截，" + method.getName());
	}
}
