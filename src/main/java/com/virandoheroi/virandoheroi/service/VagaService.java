package com.virandoheroi.virandoheroi.service;

import com.virandoheroi.virandoheroi.model.Vaga;

public interface VagaService {
	
	Vaga cadastrarVaga(Vaga vaga);
	
	void deletarVaga(Integer id);
	
	Iterable<Vaga> buscarVagas();
}