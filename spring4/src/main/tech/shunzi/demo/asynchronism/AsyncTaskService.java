package tech.shunzi.demo.asynchronism;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Version:v1.0 (description:  ) Date:2018/1/18 0018  Time:21:29
 */
@Service
public class AsyncTaskService {

	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("执行异步任务：" + i);
	}

	@Async
	public void executeAsyncTaskPlus(Integer i) {
		System.out.println("执行异步任务+1: " + (i + 1));
	}
}
