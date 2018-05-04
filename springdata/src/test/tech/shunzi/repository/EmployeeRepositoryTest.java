//package tech.shunzi.repository;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import tech.shunzi.domain.Employee;
//
///**
// * Version:v1.0 (description:  ) Date:2018/2/23 0023  Time:12:20
// */
//public class EmployeeRepositoryTest {
//
//	public ApplicationContext context = null;
//
//	private EmployeeRepository repository = null;
//
//	@Before
//	public void setUp() {
//		context = new ClassPathXmlApplicationContext("classpath:spring/bean-spring-data.xml");
//		System.out.println("set up context!");
//		repository = context.getBean(EmployeeRepository.class);
//	}
//
//	@After
//	public void tearDown() {
//		context = null;
//		System.out.println("tear down context");
//	}
//
//	/**
//	 * java.lang.ClassNotFoundException: org.springframework.context.event.EventListenerFactory
//	 * 解决方案：修改Context的版本
//	 * eg.
//	 * <dependency>
//	 * 		<groupId>org.springframework</groupId>
//	 * 		<artifactId>spring-context</artifactId>
//	 * 		<version>4.3.7.RELEASE</version>
//	 * </dependency>
//	 */
//	@Test
//	public void testFindByName() {
//		// org.springframework.data.jpa.repository.support.SimpleJpaRepository@765df79d
//		System.out.println(repository);
//		Employee employee = repository.findByName("zhangsan");
//		System.out.println(employee);
//	}
//
//}
