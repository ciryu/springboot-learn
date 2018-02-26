package tech.shunzi.dao.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tech.shunzi.dao.StudentDao;
import tech.shunzi.domain.Student;
import tech.shunzi.util.JDBCUtil;

/**
 * Version:v1.0 (description:  ) Date:2018/2/8 0008  Time:22:35
 */
public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> queryAll() {

		List<Student> students = new ArrayList<>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String sql = "SELECT id,name,age FROM student";
		try {
			connection = JDBCUtil.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				students.add(new Student(resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getInt("age")));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.release(resultSet, preparedStatement, connection);
		}

		return students;
	}

	@Override
	public Student queryById(int id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String sql = "SELECT id,name,age FROM student WHERE id = ?";
		Student student = null;
		try {
			connection = JDBCUtil.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			student = new Student(resultSet.getInt("id"), resultSet.getString("name"),
					resultSet.getInt("age"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return student;
	}

	@Override
	public Student save(Student student) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String sql = "INSERT INTO student (name,age) VALUES (?,?)";
		try {
			connection = JDBCUtil.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setInt(2, student.getAge());

			preparedStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.release(resultSet, preparedStatement, connection);
		}

		return student;
	}
}
