package com.blakelong.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	@RequestMapping("/say-hello")
	public String sayHello() {
		return "say-hello";
	}
	
	@RequestMapping("/once-again")
	public String onceMore() {
		return "once-again";
	}
}
