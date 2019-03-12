package com.student.demo.samples.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.student.demo.samples.entity.Student;
import com.student.demo.samples.exceptions.StudentNotFoundException;
import com.student.demo.samples.service.StudentServiceImpl;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentServiceImpl student_service;

	@GetMapping("/students")

	public List<Student> getAllStudents() {

		return student_service.getAllStudents();

	}

	@GetMapping("/students/{student_id}")
	public Student getStudentById(@PathVariable long student_id) {
		if (student_service.getStudentById(student_id) == null) {
			throw new StudentNotFoundException("student id with :" + student_id + "not found");
		}
		return student_service.getStudentById(student_id);
	}

	// ------------update a student - using PutMapping-----------------------
	@PutMapping("/students")
	public ResponseEntity<Student> updateRestaurant(@Valid @RequestBody Student studentDetails)
			throws ResourceNotFoundException {
		Student student = student_service.getStudentById(studentDetails.getStudentId());
		if (student == null) {
			throw new StudentNotFoundException("student not found for this id :: " + studentDetails.getStudentId());
		}

		student.setAddress(studentDetails.getAddress());
		student.setStudentName(studentDetails.getStudentName());
		student.setBranch(studentDetails.getBranch());
		final Student updatedstudent = student_service.updateStudentDetails(studentDetails);
		return ResponseEntity.ok(updatedstudent);
	}
	//------------add a new student - using POSTMapping-----------------------
	
	@PostMapping("/students")		
	public Student AddRestaurant(@Valid @RequestBody Student newrestaurant) {
				
		return this.student_service.AddStudent(newrestaurant);			
	}
	
	@DeleteMapping("/students/{student_id}")
	public void deleteStudent(@PathVariable long student_id) {
		student_service.deleteById(student_id);
	}

}
