package ar.edu.unju.fi.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.UsuarioServiceImp;

@Controller
@RequestMapping
public class AdminController {
	
	@Autowired
	UsuarioServiceImp usuarioServices;
	
	@Autowired
	private Usuario usuario;
	
	@GetMapping("/administrador")
	public String getUsuarioForm(Model model) {
		model.addAttribute("usuarioDelForm", usuario);
		model.addAttribute("listaUsuarios", usuarioServices.listarTodos());
		return "bd";
	}
	
	@PostMapping("/administrador")
	public String crearUsuario(@ModelAttribute("usuarioDelForm") Usuario usuario, ModelMap model) {
		usuarioServices.crearUsuario(usuario);
		model.addAttribute("listaUsuarios", usuarioServices.listarTodos());
		return "redirect:/administrador";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(Model model, @PathVariable (name = "id") Long id) throws Exception{
		Usuario usuarioEncontrado=usuarioServices.encontrarUsuario(id);
		model.addAttribute("usuarioDelForm", usuarioEncontrado);
		model.addAttribute("listaUsuarios", usuarioServices.listarTodos());
		model.addAttribute("editMode", true);
		return "bd";
	}
	
	@PostMapping("/editar")
	public String postEditarUsuario(@Valid @ModelAttribute("usuarioDelForm") Usuario usuario, BindingResult result, Model model) throws Exception {
		usuarioServices.modificar(usuario);
		model.addAttribute("usuarioDelForm", usuario);
		model.addAttribute("listaUsuarios", usuarioServices.listarTodos());
		model.addAttribute("editMode", false);
		return "redirect:/administrador";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(Model model, @PathVariable(name = "id") Long id) {
		usuarioServices.eliminar(id);;
		return "redirect:/administrador";
	}
	
	@GetMapping("/cancelar")
	public String cancelarEditar(ModelMap model) {
		return "redirect:/administrador";
	}
}
