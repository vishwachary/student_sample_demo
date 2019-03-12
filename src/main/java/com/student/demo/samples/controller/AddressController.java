package com.student.demo.samples.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.samples.entity.Address;
import com.student.demo.samples.service.AddressServiceImpl;

@RestController
@RequestMapping("/api")
public class AddressController {
	
	
	@Autowired
	AddressServiceImpl address_service;
	
	@GetMapping("/address")
	
	public List<Address> getAllAddress()
	{
		
		return address_service.getAllAddress();
		
	}
	
	
	


}
