package tech.shunzi.demo.websocket.point2point;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Version:v1.0 (description:  ) Date:2018/1/30 0030  Time:20:20
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/login").permitAll() // 对“/”和“/login”路径不拦截
				.anyRequest().authenticated().and().formLogin()
				.loginPage("/login") // 设置Spring Security的登录页面访问的路径为 "/login"
				.defaultSuccessUrl("/chat") // 登陆成功后转向 “/chat” 路径
				.permitAll().and().logout().permitAll();
	}

	// 内存中分配两个用户和角色
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().passwordEncoder(new PasswordEncoder() {

			@Override
			public String encode(CharSequence charSequence) {
				return charSequence.toString();
			}

			@Override
			public boolean matches(CharSequence charSequence, String s) {
				return s.equals(charSequence.toString());
			}
		}).withUser("shunzi").password("shunzi").roles("USER").and()
				.withUser("Elvis").password("Elvis").roles("USER");
	}

	// 该路径下的静态资源不拦截
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/static/**");
	}
}
