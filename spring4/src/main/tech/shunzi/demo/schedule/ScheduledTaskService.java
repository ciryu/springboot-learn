package tech.shunzi.demo.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Version:v1.0 (description:  ) Date:2018/1/18 0018  Time:21:43
 */
@Service
public class ScheduledTaskService {

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

	// @Scheduled 声明该方法是计划任务，fixedRate属性每隔固定时间执行
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("每隔五秒执行一次 " + DATE_FORMAT.format(new Date()));
	}

	// @Scheduled 声明该方法是计划任务，cron属性可按照指定时间执行 21:52:00
	// cron是UNIX和类UNIX系统下的定时任务
	@Scheduled(cron = "0 52 21 ? * *")
	public void fixTimeExecution() {
		System.out.println("在指定时间 " + DATE_FORMAT.format(new Date()) + "执行");
	}
}
