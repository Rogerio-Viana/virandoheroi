package com.virandoheroi.virandoheroi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virandoheroi.virandoheroi.model.Vaga;

@RequestMapping(value={"/vaga", "/vaga/"}, method = RequestMethod.GET)
@Controller
public class VagaController {
	
	
	@PostMapping({"/cadastrar", "/cadastrar/"})
	public String cadastrarVaga(@ModelAttribute Vaga vaga) {
		
		return "redirect:/index";
	}
}
