package tech.shunzi.common.config.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Version:v1.0 (description:  ) Date:2018/1/15 0015  Time:22:40
 */
public class ProfileDemoRunner {

	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		//先设置活动的Profile为prod
		context.getEnvironment().setActiveProfiles("prod");
		//再注册配置类（颠倒顺序会报Bean未定义的错误）
		context.register(ProfileConfig.class);
		//刷新容器
		context.refresh();

		DemoBean demoBean = context.getBean(DemoBean.class);

		System.out.println(demoBean.getContent());

		context.close();
	}


}
