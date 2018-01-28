package tech.shunzi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.shunzi.demo.config.AuthorSettings;

@SpringBootApplication
@RestController
public class SpringbootApplication {

	@Autowired
	private AuthorSettings authorSettings;

	@Value("${book.author}")
	private String bookAuthor;

	@Value("${book.name}")
	private String bookName;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@RequestMapping("/index")
	public String index() {
		return "Hello Spring Boot!";
	}

	@RequestMapping("/book/info")
	public String bookInfo() {
		return "book name is:" + bookName + " and book author is:" + bookAuthor;
	}

	@RequestMapping("/author/info")
	public String authorInfo() {
		return "author name is:" + authorSettings.getName() + " and author age is: "
				+ authorSettings.getAge();
	}
}
