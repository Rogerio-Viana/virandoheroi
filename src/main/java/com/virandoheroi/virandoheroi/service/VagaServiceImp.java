package com.virandoheroi.virandoheroi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virandoheroi.virandoheroi.model.Vaga;
import com.virandoheroi.virandoheroi.repository.VagaRepository;

@Service
public class VagaServiceImp implements VagaService {
	
	@Autowired
	private VagaRepository vr;

	@Override
	public Vaga cadastrarVaga(Vaga vaga) {
		return vr.save(vaga);
	}

	@Override
	public void deletarVaga(Integer id) {
		vr.deleteById(id);
	}

	@Override
	public Iterable<Vaga> buscarVagas() {
		return vr.findAll();
	}

}
