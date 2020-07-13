package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.model.Localidad;
import ar.edu.unju.fi.service.LocalidadServiceImp;

public class LocalidadController {

	@Autowired
	LocalidadServiceImp localidadServices;

	@Autowired
	private Localidad localidad;
	

	@GetMapping("/administrador")
	public String getLocalidadForm(Model model) {
		model.addAttribute("localidadForm", localidad);
		model.addAttribute("listaLocalidades", localidadServices.listarTodos());
		return "bd";
	}

	@PostMapping("/administrador")
	public String crearLocalidad(@ModelAttribute("localidadForm") Localidad localidad, ModelMap model) {
		localidadServices.crearLocalidad(localidad);
		model.addAttribute("listaLocalidades", localidadServices.listarTodos());
		return "redirect:/administrador";
	}
	
}
