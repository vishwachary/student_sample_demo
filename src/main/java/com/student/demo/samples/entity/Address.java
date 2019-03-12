package com.student.demo.samples.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="address_id")
	private int addressId;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(String street, String city,String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
	
//	 @OneToOne(mappedBy = "address")
//	    private Student sudent;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

//	public Student getSudent() {
//		return sudent;
//	}
//
//	public void setSudent(Student sudent) {
//		this.sudent = sudent;
//	}

		

}
