package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.model.RegistroTracking;
import ar.edu.unju.fi.service.RegistroTrackingServiceImp;

@Controller
@RequestMapping
public class RegistroController {
	
	@Autowired
	RegistroTrackingServiceImp registroTrackingService;
	
	
	@Autowired
	private RegistroTracking registroTracking;
	
	@GetMapping("/registros")
	public String getRefistroForm(Model model) {
		model.addAttribute("registroTracking", registroTracking);
		return "registrador";
	}
	
	@PostMapping("/save")
	public String guardar(RegistroTracking registroTracking, Model model) {
		registroTrackingService.guardarRegistroTracking(registroTracking);
		return "redirect:/registros";
	}
}
