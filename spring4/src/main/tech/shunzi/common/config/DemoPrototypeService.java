package tech.shunzi.common.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Version:v1.0 (description: 声明scope为prototype  )
 * 每次调用新建一个Bean的实例。
 *
 * Date:2018/1/15 0015  Time:21:19
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
