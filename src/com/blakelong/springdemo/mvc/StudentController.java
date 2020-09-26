package com.blakelong.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		// create new student object
		
		// add student as model attribute
		
		return "student-form";
	}
}
