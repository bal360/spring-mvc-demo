package com.blakelong.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new method to read form data and
	// add data to model
	@RequestMapping("/processFormVersionTwo")
	public String greetingShout(HttpServletRequest request, Model model) {
		
		// read request param from form
		String name = request.getParameter("studentName");
		
		// convert data to uppercase
		name = name.toUpperCase();
		
		// create the message
		String result = "Yo! " + name;
		
		// add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
