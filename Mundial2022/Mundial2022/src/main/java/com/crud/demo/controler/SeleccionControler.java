package com.crud.demo.controler;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.demo.modelo.Seleccion;
import com.crud.demo.serviceInterface.ISeleccionService;

@Controller
@RequestMapping
public class SeleccionControler {
	
	@Autowired
	private ISeleccionService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("seleccion", service.listar());
		return "index";
	}
	@GetMapping("/listar/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("seleccion", service.listarId(id));
		return "form";
	}
	
	@GetMapping("/new")
	public String nuevo(Model model) {
		model.addAttribute("seleccion", new Seleccion());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Valid Seleccion p,Model model) {
		int id=service.save(p);
		if(id==0) {
			return "form";
		}
		return "redirect:/listar";
	}
	
	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listar";
	}
}
