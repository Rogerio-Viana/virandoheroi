package com.virandoheroi.virandoheroi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.virandoheroi.virandoheroi.model.Ong;
import com.virandoheroi.virandoheroi.service.OngService;

@Controller
@RequestMapping({ "/ong", "/ong/" })
public class OngController {

	@Autowired
	private OngService ongService;

	@GetMapping({ "", "/" })
	public ModelAndView ong() {
		return new ModelAndView("ong_cadastrar");
	}

	@ResponseBody
	@PostMapping({ "", "/" })
	public String ongCadastrar(@ModelAttribute Ong model) {
		Ong ong = ongService.cadastrarOng(model);
		return "Use sei código para atualizar seus dados.\nAcesse '/ong/seu_codigo_de_acesso'.\nCódigo de acesso: " + ong.getCodAcesso();
	}

	@GetMapping({ "/{id}", "/{id}/" })
	public ModelAndView ongBuscar(@PathVariable("id") String id) {
		Ong ong = ongService.buscarOng(id);
		return new ModelAndView("ong_cadastrar")
				.addObject("ong", ong)
				.addObject("countVaga", ong.getVagas().size() + 1);
	}

}
