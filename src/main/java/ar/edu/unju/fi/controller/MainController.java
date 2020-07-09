package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	@GetMapping("/index")
	public String main(Model model) {
		return "index";
	}
	
	@GetMapping("/prueba")
	public String main2(Model model) {
		return "prueba";
	}
	
	@GetMapping("/login")
	public String main3(Model model) {
		return "login";
	}
	
	@GetMapping("/consultor")
	public String main4(Model model) {
		return "consultor";
	}
}
