package tech.shunzi.demo.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Version:v1.0 (description: 实现 BeanNameAware 获得 Bean 名称；
 * 							  实现 ResourceLoaderAware 获得资源加载服务)
 *
 * ResourceLoaderAware 需要重写 setResourceLoader() 方法
 * BeanNameAware 需要重写 setBeanName() 方法
 *
 * Date:2018/1/18 0018  Time:20:38
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanName;

	private ResourceLoader loader;

	@Override
	public void setBeanName(String s) {
		this.beanName = s;
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
	}

	public void outputResult() {
		System.out.println("Bean的名称为：" + beanName);
		Resource resource = loader.getResource("classpath:tech/shunzi/demo/aware/test.txt");

		try {
			System.out.println(
					"ResourceLoader 加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
