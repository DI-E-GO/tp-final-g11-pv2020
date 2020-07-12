package ar.edu.unju.fi.service;


import ar.edu.unju.fi.model.Usuario;

public interface IUsuarioService {
	public void crearUsuario(Usuario usuario);
	public Usuario modificar();
	public void eliminar(Long id);
	public Iterable<Usuario> listarTodos();
	//public Optional<Usuario> encontrarUsuario(Long id); 
}
