package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Prueba1 {
	@GetMapping("/index")
	public String main(Model model) {
		return "index";
	}
	
	@GetMapping("/prueba")
	public String main2(Model model) {
		return "prueba";
	}
}
