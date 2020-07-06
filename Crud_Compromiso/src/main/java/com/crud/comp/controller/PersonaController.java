package com.crud.comp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.comp.modelo.Persona;
import com.crud.comp.serviceInterface.IPersonaService;

@Controller
@RequestMapping
public class PersonaController {

	@Autowired
	private IPersonaService service;

	// -------- Persona ------------------------------------------------
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("personas", service.listar());
		return "personas_list";
	}

	@GetMapping("/listar/{id}")
	public String listarId(@PathVariable int id, Model model) {
		model.addAttribute("persona", service.listarId(id));
		return "personas_form";
	}

	@GetMapping("/new")
	public String nuevo(Model model) {
		model.addAttribute("persona", new Persona());
		return "personas_form";
	}

	@PostMapping("/save")
	public String save(@Valid Persona p, Model model) {
		int id = service.save(p);
		if (id == 0) {
			return "personas_form";
		}
		return "redirect:/listar";
	}

	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		service.delete(id);
		return "redirect:/listar";
	}

}
