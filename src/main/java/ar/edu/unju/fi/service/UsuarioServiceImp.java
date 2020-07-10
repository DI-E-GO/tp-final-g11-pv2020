package ar.edu.unju.fi.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuarioDAO;

@Service
public class UsuarioServiceImp implements IUsuarioService {

	@Autowired
	IUsuarioDAO usuarioDAOImp;
	
	@Override
	public void crearUsuario(Usuario usuario) {
		usuarioDAOImp.save(usuario);

	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterable<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return usuarioDAOImp.findAll();
	}

}
