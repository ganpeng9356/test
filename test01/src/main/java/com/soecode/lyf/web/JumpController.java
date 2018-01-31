package com.soecode.lyf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jump")
public class JumpController {

	@RequestMapping("test.do")
	public String jumpTest(){
		return "test";
	}
}
