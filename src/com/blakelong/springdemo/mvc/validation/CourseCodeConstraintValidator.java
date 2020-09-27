package com.blakelong.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}
	
	@Override
	public boolean isValid(String formData, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result;
		
		if (formData != null) {
			result = formData.startsWith(coursePrefix);
		} else {
			return true;
		}
		
		return result;
	}
	
}
