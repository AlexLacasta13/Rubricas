package com.example.demo2.repository;

import com.example.demo2.dto.PersonDTO;

public interface PersonRepository {

	void persist(PersonDTO personDTO);

}