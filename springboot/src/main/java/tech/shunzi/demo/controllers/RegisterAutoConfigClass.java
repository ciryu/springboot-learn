package tech.shunzi.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.shunzi.demo.service.HelloService;

/**
 * Version:v1.0 (description:  ) Date:2018/1/28 0028  Time:18:38
 */
@RestController
@SpringBootApplication
public class RegisterAutoConfigClass {

	@Autowired
	private HelloService helloService;

	@GetMapping("/register")
	public String index() {
		return helloService.sayHello();
	}

	public static void main(String[] args){
		SpringApplication.run(RegisterAutoConfigClass.class, args);
	}

}

