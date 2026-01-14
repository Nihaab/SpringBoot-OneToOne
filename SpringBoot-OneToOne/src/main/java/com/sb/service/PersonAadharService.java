package com.sb.service;

import java.util.List;

import com.sb.entity.Person;

public interface PersonAadharService 
{

	void addPersonInService(Person person);

	List<Person> getAllData();

}
