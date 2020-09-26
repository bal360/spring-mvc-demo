package com.blakelong.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countries}")
	private Map<String, String> countries;
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		// create new student object
		Student student = new Student();
		
		// add student as model attribute
		model.addAttribute("student", student);
		
		// add country options to the model
		model.addAttribute("countries", countries);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		// log the input data
		System.out.println("Full Name: " + student.getFirstName() + " " + student.getLastName());
		
		return "student-confirmation";
	}
}
