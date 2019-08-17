package com.magalhaes_andre.persons.dao;

import org.springframework.data.repository.CrudRepository;

import com.magalhaes_andre.persons.model.Person;

public interface PersonDAO extends CrudRepository<Person, Integer> {

}
