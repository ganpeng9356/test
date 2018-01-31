package com.soecode.lyf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class TestController {

	@RequestMapping("test.do")
	public String test(){
		System.out.println("1245");
		return "login";
	}
}
