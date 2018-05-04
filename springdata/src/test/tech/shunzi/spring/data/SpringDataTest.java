package tech.shunzi.spring.data;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tech.shunzi.repository.StudentRepository;
import tech.shunzi.repository.impl.StudentRepositoryImpl;

/**
 * Version:v1.0 (description:  ) Date:2018/2/22 0022  Time:11:09
 */
public class SpringDataTest {

	public ApplicationContext context = null;

	private StudentRepository studentRepository;

	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext("classpath:spring/bean-spring-data.xml");
		System.out.println("set up context!");
		studentRepository = context.getBean(StudentRepositoryImpl.class);
	}

	@After
	public void tearDown() {
		context = null;
		System.out.println("tear down context");
	}

	@Test
	public void testEntityManagerFactory() {

	}

	@Test
	public void testProcedure() {
		System.out.println(studentRepository.testProcedure(20));
	}
}
