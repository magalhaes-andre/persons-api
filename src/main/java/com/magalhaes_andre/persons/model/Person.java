package com.magalhaes_andre.persons.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Person {
	
	@Id
	private Integer id;
	
	@NotNull
	private String nome;
	@NotNull
	private String cpf;
	@NotNull
	private String email;
	@NotNull
	private Date birth;

}
