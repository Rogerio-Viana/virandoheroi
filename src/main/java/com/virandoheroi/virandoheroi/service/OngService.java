package com.virandoheroi.virandoheroi.service;

import java.util.List;

import com.virandoheroi.virandoheroi.model.Ong;

public interface OngService {

	Ong buscarOng(String id);

	Ong cadastrarOng(Ong ong);

	List<Ong> buscarOngs();

	Ong buscarOngId(Integer idOng);

}
