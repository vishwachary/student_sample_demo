package com.student.demo.samples.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) 
public class StudentNotFoundException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorMessage;
	private String  http_status_code;
	
	public StudentNotFoundException(String exception) {
		super(exception);
}
	
	
}
