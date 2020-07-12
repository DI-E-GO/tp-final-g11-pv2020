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
	public Iterable<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return usuarioDAOImp.findAll();
	}
	
	@Override
	public Usuario encontrarUsuario(Long id) throws Exception {
		// TODO Auto-generated method stub
		return usuarioDAOImp.findById(id).orElseThrow(()->new Exception("El usuario no exixte"));
	}

	@Override
	public Usuario modificar(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		Usuario usuarioGuardar= encontrarUsuario(usuario.getId());
		mapearUsuario(usuario, usuarioGuardar);
		return usuarioDAOImp.save(usuarioGuardar);
	}

	public void mapearUsuario(Usuario desde, Usuario hacia) {
		hacia.setApellidoReal(desde.getApellidoReal());
		hacia.setNombreReal(desde.getNombreReal());
		hacia.setNombreUsuario(desde.getNombreUsuario());
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		usuarioDAOImp.deleteById(id);
	}
	

}
