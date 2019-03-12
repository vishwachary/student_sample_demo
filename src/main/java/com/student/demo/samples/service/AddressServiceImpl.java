package com.student.demo.samples.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.samples.entity.Address;
import com.student.demo.samples.entity.Student;
import com.student.demo.samples.repository.AddressRepository;

@Service
public class AddressServiceImpl  implements AddressService{
	
	@Autowired
	AddressRepository address_repository;

	@Override
	public List<Address> getAllAddress() {
		 List<Address> all_address =  new ArrayList<Address> ();
			
		 all_address=(List<Address>) address_repository.findAll();
		
		return all_address;
	}

}
