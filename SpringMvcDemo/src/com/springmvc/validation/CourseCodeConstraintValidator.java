package com.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String>{

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode thecode) {
		coursePrefix = thecode.value();
	}
	
	@Override
	public boolean isValid(String thecode, ConstraintValidatorContext context) {
		
		boolean result;
		
		if(thecode != null) {
		
		 result = thecode.startsWith(coursePrefix);
		
		}
		else {
			return true;
		}
		
		return result;
	}

}
