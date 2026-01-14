package com.sb.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.entity.Person;
import com.sb.service.PersonAadharService;

@RestController
@RequestMapping(value = "/personAadhar/v1")
public class HomeController 
{
	@Autowired
	private PersonAadharService pas;
	
	@RequestMapping(value = "/personAdd")
	public ResponseEntity<?> addPersonWithAadhar(@RequestBody Person person)
	{
		System.out.println(person);
		person.getAadhar().setRegDate(new Date());
		System.out.println(person);
		
		pas.addPersonInService(person);
		
		return new ResponseEntity("Person details inserted....", HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getAllData")
	public ResponseEntity<?> getPersonWithAadhar()
	{
		List<Person> allData = pas.getAllData();
		
		return new ResponseEntity(allData,HttpStatus.OK);
	}
}
