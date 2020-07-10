package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;

@Controller
@RequestMapping
public class UsuarioController {
	
	@Autowired
	IUsuarioService usuarioService;
	
	@Autowired
	private Usuario usuario;
	
	@GetMapping("/administrador")
	public String getUsuarioForm(Model model) {
		model.addAttribute("usuarioDelForm", usuario);
		model.addAttribute("listaUsuarios", usuarioService.listarTodos());
		return "bd";
	}
	
	@PostMapping("/administrador")
	public String crearUsuario(@ModelAttribute("usuarioDelForm") Usuario usuario, Model model) {
		usuarioService.crearUsuario(usuario);
		model.addAttribute("listaUsuarios", usuarioService.listarTodos());
		return "redirect:/administrador";
	}
}
