package com.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.entity.Person;
import com.sb.repository.PersonRepository;

@Service
public class PersonAadharServiceimpl implements PersonAadharService
{

	@Autowired
	private PersonRepository pr;
	
	
	@Override
	public void addPersonInService(Person person) 
	{
		pr.save(person);
	}


	@Override
	public List<Person> getAllData() {
		List<Person> findAll = pr.findAll();
		return findAll;
	}

}
