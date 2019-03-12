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
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="home_address_id")
    private Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
		
//	public Student(String name, String branch,Address address) {
//		this.studentName = name;
//        this.branch = branch;
//        this.address = address;
//        this.address.setSudent(this);
//    }

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
