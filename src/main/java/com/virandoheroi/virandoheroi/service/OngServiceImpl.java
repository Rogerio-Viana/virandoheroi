package com.virandoheroi.virandoheroi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virandoheroi.virandoheroi.model.Ong;
import com.virandoheroi.virandoheroi.model.Vaga;
import com.virandoheroi.virandoheroi.repository.OngRepository;

@Service
public class OngServiceImpl implements OngService {

	@Autowired
	private OngRepository ongRepo;

	@Override
	public Ong buscarOng(String id) {
		Ong ong = ongRepo.findByCodAcesso(id);
		return ong;
	}

	@Override
	public Ong cadastrarOng(Ong model) {
		UUID uuid = UUID.randomUUID();
		String myRandom = uuid.toString();

		Ong ong = new Ong();
		if (model.getId() != null) {
			ong.setId(model.getId());
		}

		List<Vaga> vagas = new ArrayList<Vaga>();

		for (Vaga vaga : model.getVagas()) {
			if (vaga.getTitulo() != null) {
				vagas.add(vaga);
			}
		}

		ong.setUrlImg(model.getUrlImg());
		ong.setVagas(vagas);
		ong.setNome(model.getNome());
		ong.setEndereco(model.getEndereco());
		ong.setDescricao(model.getDescricao());
		ong.setContato(model.getContato());
		ong.setCodAcesso(model.getCodAcesso() == null ? myRandom.substring(0, 5) : model.getCodAcesso());

		return ongRepo.save(ong);
	}

	@Override
	public List<Ong> buscarOngs() {
		return ongRepo.findAll();
	}

	@Override
	public Ong buscarOngId(Integer idOng) {
		return ongRepo.findById(idOng).get();
	}

}
