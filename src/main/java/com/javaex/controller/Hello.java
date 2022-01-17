package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	@RequestMapping("/hello")//주소가 hello    http://localhost:8088/hellospring/hello 주소창에 이렇게.
	public String hello() {
		System.out.println("/hellospring/hello");
		return "/WEB-INF/views/index.jsp"; //포워드. index.jsp로 넘어가서 helloworld찍을것 -> index.jsp만들어야함
	}
}
