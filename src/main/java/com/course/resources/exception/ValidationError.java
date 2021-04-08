package com.course.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	
	private static final long serialVersionUID = 1L;

	private List<FieldMessage> errors = new ArrayList<>(); 
	
	
	public ValidationError(Integer status, String msg, Long timeStamLong) {
		super(status, msg, timeStamLong);
	}


	public List<FieldMessage> getErros() {
		return errors;
	}

	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}
}
