package com.magalhaes_andre.persons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.magalhaes_andre.persons.dao.PersonDAO;
import com.magalhaes_andre.persons.model.Person;

@RequestMapping("/api")
public class Persons {
	
	@Autowired
	PersonDAO personDAO;
	
	@PostMapping("/persons")
	public Person addPerson(@RequestBody Person person) {
		return person;
	}
	
	@GetMapping("/persons/{id}")
	public Person getPersonById(@PathVariable Integer id) {
		return personDAO.findById(id).get();
	}
	
	@DeleteMapping("/persons/{id}")
	public void deletePerson(@PathVariable Integer id){
		personDAO.deleteById(id);
	}
}
