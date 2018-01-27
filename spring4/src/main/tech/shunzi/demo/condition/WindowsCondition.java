package tech.shunzi.demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Version:v1.0 (description:  )
 * Date:2018/1/27 0027  Time:20:51
 *
 */
public class WindowsCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return context.getEnvironment().getProperty("os.name").contains("Windows");
	}
}
