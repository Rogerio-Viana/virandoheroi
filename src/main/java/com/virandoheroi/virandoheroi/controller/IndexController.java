package com.virandoheroi.virandoheroi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.virandoheroi.virandoheroi.service.OngService;

@RequestMapping({ "/", "" })
@Controller
public class IndexController {

	@Autowired
	private OngService ongService;

	@RequestMapping({ "/" })
	public ModelAndView index() {
		return new ModelAndView("index").addObject("ongs", ongService.buscarOngs());
	}
}
