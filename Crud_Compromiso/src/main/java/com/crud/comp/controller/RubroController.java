package com.crud.comp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.comp.modelo.Rubro;
import com.crud.comp.serviceInterface.IRubroService;

@Controller
@RequestMapping
public class RubroController {

	@Autowired
	private IRubroService service;

	// -------- Rubro --------------------------------------------------
	@GetMapping("/rubro_listar")
	public String listar(Model model) {
		model.addAttribute("rubros", service.listar());
		return "rubros_list";
	}

	@GetMapping("/rubro_listar/{id}")
	public String listarId(@PathVariable int id, Model model) {
		model.addAttribute("rubro", service.listarId(id));
		return "rubros_form";
	}

	@GetMapping("/rubro_new")
	public String nuevo(Model model) {
		model.addAttribute("rubro", new Rubro());
		return "rubros_form";
	}

	@PostMapping("/rubro_save")
	public String save(@Valid Rubro r, Model model) {
		int id = service.save(r);
		if (id == 0) {
			return "rubros_form";
		}
		return "redirect:/rubro_listar";
	}

	@GetMapping("/rubro_delete/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		service.delete(id);
		return "redirect:/rubro_listar";
	}

}
