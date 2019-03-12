package com.student.demo.samples.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.student.demo.samples.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	Student getStudentById(long student_id);
	void deleteById(long student_id);
	Student updateStudentDetails(Student student);
	public Student AddStudent(Student newstudent) ;

}
