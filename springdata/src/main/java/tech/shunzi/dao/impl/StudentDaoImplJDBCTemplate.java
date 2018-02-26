package tech.shunzi.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tech.shunzi.dao.StudentDao;
import tech.shunzi.domain.Student;

/**
 * Version:v1.0 (description:  ) Date:2018/2/19 0019  Time:21:58
 */
public class StudentDaoImplJDBCTemplate implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> queryAll() {
		List<Student> students = new ArrayList<>();
		String sql = "SELECT id,name,age FROM student";
		jdbcTemplate.query(sql, new RowCallbackHandler() {

			@Override
			public void processRow(ResultSet resultSet) throws SQLException {
				students.add(new Student(resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getInt("age")));
			}
		});
		return students;
	}

	@Override
	public Student save(Student student) {
		String sql = "INSERT INTO student (name,age) VALUES (?,?)";
		jdbcTemplate.update(sql,new Object[]{student.getName(),student.getAge()});
		return null;
	}

	@Override
	public Student queryById(int id) {
		return null;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
}
