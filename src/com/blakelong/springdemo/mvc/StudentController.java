package com.blakelong.springdemo.mvc;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
	
//	@Value("#{countries}")
//	private Map<String, String> countries;
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		// create new student object
		Student student = new Student();
		
		// add student as model attribute
		model.addAttribute("student", student);
		
		// add country options to the model
//		model.addAttribute("countries", countries);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student, 
			@RequestParam Map<String, String> params) {
		
		// log the input data		
		System.out.println(params);
		
		return "student-confirmation";
	}
}
