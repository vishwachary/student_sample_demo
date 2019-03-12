package com.student.demo.samples.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.student.demo.samples.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

	Student findByStudentId(long userid);
}
