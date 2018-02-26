package tech.shunzi.util;

import sun.java2d.cmm.Profile;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Version:v1.0 (description: JDBCUtil ) Date:2018/2/8 0008  Time:22:14
 */
public class JDBCUtil {

	/**
	 * getConnection
	 * @return connection
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getConnection()
			throws ClassNotFoundException, SQLException, IOException {
		String url = "jdbc:mysql:///spring_data";
		String user = "root";
		String password = "";
		String driverClass = "com.mysql.jdbc.Driver";

		InputStream inputStream = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		String url2 = properties.getProperty("jdbc.url");
		String user2 = properties.getProperty("jdbc.user");
		String password2 = properties.getProperty("jdbc.password");
		String driverClass2 = properties.getProperty("jdbc.driverClass");

//		Class.forName(driverClass);
//		Connection connection = DriverManager.getConnection(url,user,password);
		Class.forName(driverClass2);
		Connection connection = DriverManager.getConnection(url2,user2,password2);
		return connection;
	}


	public static void release(ResultSet resultSet,Statement statement,
			Connection connection) {
		if(null != resultSet) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if(null != statement) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if(null != connection) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
