package tech.shunzi.dao;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tech.shunzi.dao.impl.StudentDaoImpl;
import tech.shunzi.dao.impl.StudentDaoImplJDBCTemplate;
import tech.shunzi.domain.Student;

/**
 * Version:v1.0 (description:  ) Date:2018/2/8 0008  Time:22:44
 */
public class StudentDaoImplTest {

	StudentDao studentDao = new StudentDaoImpl();

	StudentDao studentDaoJDBC = null;

	public ApplicationContext context = null;

	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext("classpath:spring/bean.xml");
		System.out.println("set up context!");
		studentDaoJDBC = (StudentDao) context.getBean("studentDaoImpl");
	}

	@After
	public void tearDown() {
		context = null;
		System.out.println("tear down context");
	}

	@Test
	public void testQueryAll() {
		System.out.println(studentDao.queryAll());
		System.out.println(studentDaoJDBC.queryAll());
		Assert.assertEquals(studentDao.queryAll(),studentDaoJDBC.queryAll());
	}

	@Test
	public void testUpdate() {
		Student student = new Student();
		student.setName("imooc-jdbc");
		student.setAge(12);
//		System.out.println(studentDao.save(student));
		studentDaoJDBC.save(student);
	}

}
