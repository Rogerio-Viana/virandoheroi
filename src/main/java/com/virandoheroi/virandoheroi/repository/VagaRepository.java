package com.virandoheroi.virandoheroi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.virandoheroi.virandoheroi.model.Vaga;

@Repository
public interface VagaRepository extends CrudRepository<Vaga, Integer> {
	
}
