package tech.shunzi.common.config.springEL;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Version:v1.0 (description:  ) Date:2018/1/15 0015  Time:21:39
 */
@Configuration
@ComponentScan("tech.shunzi.common.config.springEL")
//注入配置文件 @PropertySource 指定文件地址
@PropertySource("classpath:tech/shunzi/common/config/springEL/test.properties")
public class Elconfig {

	@Value("I love you!")
	private String normal;

	//注入操作系统属性
	@Value("#{systemProperties['os.name']}")
	private String osName;

	//注入表达式结果
	@Value("#{ T(java.lang.Math).random() * 100.0 }")
	private double randomNumber;

	//注入其他Bean属性
	@Value("#{demoService.another}")
	private String fromAnother;

	//注入文件资源
	@Value("classpath:tech/shunzi/common/config/springEL/test.txt")
	private Resource testFile;

	//注入网址资源
	@Value("http://www.baidu.com")
	private Resource testUrl;

	//注入配置文件 使用@Value注入，则需要配置一个PropertySourcesPlaceholderConfigurer
	@Value("${book.name}")
	private String bookName;

	//注入配置文件 注入Properties可以从Environment中获得
	@Autowired
	private Environment environment;

	//注入配置文件
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public void outputResource() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);

			// 导入 common-io 的包
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
