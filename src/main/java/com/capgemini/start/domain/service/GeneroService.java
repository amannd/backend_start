package com.capgemini.start.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.capgemini.start.domain.entity.Genero;
import com.capgemini.start.domain.repository.GeneroRepository;

@Service
public class GeneroService extends AbstractService<Genero, Long> {

	@Autowired
	private GeneroRepository repository;
	
	@Override
	protected JpaRepository<Genero, Long> getRepository() {
		return null;
	}

}
