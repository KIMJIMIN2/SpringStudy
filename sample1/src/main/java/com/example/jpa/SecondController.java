package com.example.jpa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1. 일반적인 @Controller 어노테이션과 달리 @RestController 어노테이션은 기본적으로 String 리턴 타입을 갖는다.
public class SecondController {

	@RequestMapping(value="/hello-spring", method=RequestMethod.GET) // 2. 어노테이션 명시
	public String helloString() {
		return "hello spring";
	}
}
