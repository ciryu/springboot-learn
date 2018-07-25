package tech.shunzi.demo.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public void outputResult() {
		System.out.println("从组合配置里照样获得的Bean");
	}
}
