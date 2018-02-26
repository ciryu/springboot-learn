package tech.shunzi.repository;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.RepositoryDefinition;

import tech.shunzi.domain.Employee;

/**
 * Version:v1.0 (description:  ) Date:2018/2/23 0023  Time:12:18
 */
//@RepositoryDefinition(domainClass = Employee.class,idClass = Integer.class)
public interface EmployeeRepository
		extends SelfDefineRepository<Employee, Integer>//extends Repository<Employee, Integer> {
{

	Employee findByName(String name);
}
