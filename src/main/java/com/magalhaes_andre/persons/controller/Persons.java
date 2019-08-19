package com.magalhaes_andre.persons.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.magalhaes_andre.persons.dao.PersonDAO;
import com.magalhaes_andre.persons.model.Person;

@RestController
@RequestMapping("/api")
public class Persons {
	
	@Autowired
	PersonDAO personDAO;
	
	@PostMapping("/persons")
	public Person addPerson(@RequestBody Person person) {
		return personDAO.save(person);
	}
	
	@GetMapping("/persons")
	public List<Person> getPersons(){
		return (List<Person>) personDAO.findAll();
	}
	
	@GetMapping("/persons/{id}")
	public Person getPersonById(@PathVariable Integer id) {
		return personDAO.findById(id).get();
	}
	
	@DeleteMapping("/persons/{id}")
	public void deletePerson(@PathVariable Integer id){
		personDAO.deleteById(id);
	}
	
	@PutMapping("/persons/{id}")
	public Person updatePerson(@PathVariable Integer id, @RequestBody Person person) {
		person.setId(id);
		return personDAO.save(person);
	}
}
