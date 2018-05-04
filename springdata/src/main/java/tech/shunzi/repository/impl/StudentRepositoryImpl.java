package tech.shunzi.repository.impl;

import org.hibernate.SQLQuery;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import tech.shunzi.domain.Student;
import tech.shunzi.repository.StudentRepository;

/**
 * Version:v1.0 (description:  ) Date:2018/5/3 0003  Time:22:33
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

	private final static String PROCEDURE_NAME = "test_procedure";

	private final static String IN_PARAMETER = "in_age";

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Student> testProcedure(int age) {

		StoredProcedureQuery storedProcedureQuery = entityManager
				.createStoredProcedureQuery(PROCEDURE_NAME);
		storedProcedureQuery
				.registerStoredProcedureParameter(IN_PARAMETER, int.class, ParameterMode.IN);
		storedProcedureQuery.setParameter(IN_PARAMETER, age);
		storedProcedureQuery.execute();

//		List<Object[]> objects = storedProcedureQuery.getResultList();
//		List<Student> students = objects.stream().map(object -> {
//			return new Student((int) object[0], (String) object[1], (int) object[2]);
//		}).collect(Collectors.toList());

		List<Student> result = storedProcedureQuery.unwrap(NativeQuery.class).setResultTransformer(
				Transformers.aliasToBean(Student.class)).list();
		System.out.println("another way: " + result.toString());
		return result;
	}
}
