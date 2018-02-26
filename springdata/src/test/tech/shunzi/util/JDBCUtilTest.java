package tech.shunzi.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

/**
 * Version:v1.0 (description:  ) Date:2018/2/8 0008  Time:22:17
 */
public class JDBCUtilTest {

	public ApplicationContext context = null;

	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext("classpath:spring/bean.xml");
		System.out.println("set up context!");
	}

	@After
	public void tearDown() {
		context = null;
		System.out.println("tear down context");
	}

	@Test
	public void testDataSource() throws SQLException {
		System.out.println("get context!");
		DriverManagerDataSource dataSource = (DriverManagerDataSource) context.getBean("dataSource");
		Assert.assertNotNull(dataSource);
		System.out.println(dataSource.getUrl());
		Assert.assertNotNull(dataSource.getConnection());
	}

	@Test
	public void testJDBCTemplate() {
		System.out.println("test jdbcTemplate");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		Assert.assertNotNull(jdbcTemplate);
	}

	@Test
	public void testGetConnection() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = JDBCUtil.getConnection();
		Assert.assertNotNull(connection);
	}

}
