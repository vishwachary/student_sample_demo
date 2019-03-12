package com.student.demo.samples.repository;

import org.springframework.data.repository.CrudRepository;

import com.student.demo.samples.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
