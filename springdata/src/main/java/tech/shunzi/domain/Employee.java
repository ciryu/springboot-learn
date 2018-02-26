package tech.shunzi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Version:v1.0 (description:spring-data先开发实体类  ) Date:2018/2/22 0022  Time:11:10
 */
@Entity
public class Employee {

	/**
	 * @GeneratedValue 详解 http://www.lypblog.com/index.php/archives/157/
	 */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;

	@Column(length = 20, nullable = false)
	private String name;

	@Column(nullable = false)
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
	}
}
