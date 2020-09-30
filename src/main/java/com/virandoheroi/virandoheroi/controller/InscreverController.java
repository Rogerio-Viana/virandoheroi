package com.virandoheroi.virandoheroi.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.virandoheroi.virandoheroi.service.OngService;

@Controller
@RequestMapping({ "/inscrever", "/inscrever/" })
public class InscreverController {

	@Autowired
	private OngService ongService;

	@GetMapping({ "/{ongId}" })
	public ModelAndView inscrever(@PathVariable("ongId") Integer idOng, @PathParam("vagaId") Integer idVaga) {
		return new ModelAndView("/inscrever")
				.addObject("ong", ongService.buscarOngId(idOng));
	}
}
