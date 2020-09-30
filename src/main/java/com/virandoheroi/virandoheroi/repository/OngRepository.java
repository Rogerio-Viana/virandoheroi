package com.virandoheroi.virandoheroi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.virandoheroi.virandoheroi.model.Ong;

@Repository
public interface OngRepository extends JpaRepository<Ong, Integer> {

	@Query(value = "Select * From ong Where cod_acesso Like ?1", nativeQuery = true)
	Ong findByCodAcesso(String id);
	
}
