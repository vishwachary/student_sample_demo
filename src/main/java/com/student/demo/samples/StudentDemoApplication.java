package com.student.demo.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.student.demo.samples")
public class StudentDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDemoApplication.class, args);
	}

}
