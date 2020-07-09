package ar.edu.unju.fi.service;


import java.awt.List;
import ar.edu.unju.fi.model.Usuario;

public interface IUsuarioService {
	public void crearUsuario(Usuario usuario);
	public Usuario modificar();
	public void eliminar();
	public List listar();
	//public Optional<Usuario> encontrarUsuario(Long id); 
}
