package com.student.demo.samples.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	private long studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="branch")
	private String branch;
	
	//this explians hibernate jpa - student table has a forigen key refrence to Address table.
	//address_id in Student table - FK- to- home_address_id in Address table.
	//for this example we  assumed student has 0ne-to-0ne relation ship with the Address.
	@OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name="home_address_id")
        private Address address;
   	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
		

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	}
