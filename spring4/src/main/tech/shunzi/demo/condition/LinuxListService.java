package tech.shunzi.demo.condition;

/**
 * Version:v1.0 (description:  ) Date:2018/1/27 0027  Time:21:15
 */
public class LinuxListService implements ListService {

	@Override
	public String showListCmd() {
		return "ls";
	}
}

