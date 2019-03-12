package com.student.demo.samples.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.student.demo.samples.entity.Student;
import com.student.demo.samples.repository.StudentRepository;

@Service
public class StudentServiceImpl  implements StudentService{

	@Autowired
	StudentRepository student_repository;

	public List<Student> getAllStudents()
	{
		 List<Student> all_students =  new ArrayList<Student> ();
		
		 all_students=(List<Student>) student_repository.findAll();
		
		return all_students;
		
	}
	
	
	
	public void deleteById(long student_id)
	{
		
		student_repository.delete(student_id);
	}



	@Override
	public Student getStudentById(long student_id) {
		return (Student)this.student_repository.findByStudentId(student_id);
	}



	@Override
	public Student updateStudentDetails(Student student) {
		
		return (Student)this.student_repository.save(student);
	}



	@Override
	public Student AddStudent(Student newstudent) {
		return (Student)this.student_repository.save(newstudent);
	}
	
	

}
