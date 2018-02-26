package tech.shunzi.dao;

import java.util.List;

import tech.shunzi.domain.Student;

/**
 * Version:v1.0 (description:  ) Date:2018/2/8 0008  Time:22:35
 */
public interface StudentDao {

	List<Student> queryAll();

	Student save(Student student);

	Student queryById(int id);
}
