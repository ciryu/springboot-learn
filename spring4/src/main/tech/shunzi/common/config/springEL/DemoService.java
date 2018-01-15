package tech.shunzi.common.config.springEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Version:v1.0 (description:  ) Date:2018/1/15 0015  Time:21:37
 */
@Service
public class DemoService {

	// 注入普通的的字符串
	@Value("其他类的属性")
	private String another;

	public String getAnother() {
		return another;
	}

	public void setAnother(String another) {
		this.another = another;
	}
}
