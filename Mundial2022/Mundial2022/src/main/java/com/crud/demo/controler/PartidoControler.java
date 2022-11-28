package com.crud.demo.controler;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.demo.modelo.Partido;
import com.crud.demo.serviceInterface.IpartidoService;

public class PartidoControler {
    @Autowired
	private IpartidoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("partido", service.listar());
		return "index";
	}
	@GetMapping("/listar/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("partido", service.listarId(id));
		return "form";
	}
	
	@GetMapping("/new")
	public String nuevo(Model model) {
		model.addAttribute("partido", new Partido());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Valid Partido p,Model model) {
		int id=service.save(p);
		if(id==0) {
			return "form";
		}
		return "redirect:/listar";
	}
	
	
}
