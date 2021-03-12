package com.example.jpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity  // 3. WebSecurity가 작동할 수 있도록 어노테이션 명시
@Configuration      // 3. 설정파일을 인식하도록 어노테이션 명시
public class SecurityConfig extends WebSecurityConfigurerAdapter { // 1. WebSecurityConfigurerAdapter 클래스 상속


	@Override      // 2. configure 메소드 오버라이딩
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.anyRequest()
			.permitAll();
	}
}
