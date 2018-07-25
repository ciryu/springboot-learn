package tech.shunzi.demo.condition;

/**
 * Version:v1.0 (description:  ) Date:2018/1/27 0027  Time:21:16
 */
public class WindowsListService implements ListService {

	@Override
	public String showListCmd() {
		return "dir";
	}
}
