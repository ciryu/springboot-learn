package tech.shunzi.demo.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Version:v1.0 (description: 定义 Action 注解 )
 *
 * 参考链接：https://www.cnblogs.com/Gordon-YangYiBao/archive/2012/08/07/2626340.html
 *
 * java中的四个元注解
 * @Target 注解的作用目标
 * 	@Target(ElementType.TYPE)   //接口、类、枚举、注解
 * 	@Target(ElementType.FIELD) //字段、枚举的常量
 *	@Target(ElementType.METHOD) //方法
 *	@Target(ElementType.PARAMETER) //方法参数
 *	@Target(ElementType.CONSTRUCTOR)  //构造函数
 *	@Target(ElementType.LOCAL_VARIABLE)//局部变量
 *	@Target(ElementType.ANNOTATION_TYPE)//注解
 *	@Target(ElementType.PACKAGE) ///包
 *
 * @Retention 注解的保留位置
 * 	@Retention(RetentionPolicy.SOURCE)   //注解仅存在于源码中，在class字节码文件中不包含
 * 	@Retention(RetentionPolicy.CLASS)     // 默认的保留策略，注解会在class字节码文件中存在，但运行时无法获得，
 *  @Retention(RetentionPolicy.RUNTIME)  // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
 *
 * @Documented 说明该注解将被包含在javadoc中
 *
 * @Inherited 说明子类可以继承父类中的该注解
 *
 * Date:2017/12/30 0030  Time:00:45
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

	String name();

}
