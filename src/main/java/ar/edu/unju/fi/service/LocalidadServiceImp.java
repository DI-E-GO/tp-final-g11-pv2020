package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Localidad;
import ar.edu.unju.fi.repository.ILocalidadDAO;

@Service
public class LocalidadServiceImp implements ILocalidadService {

	@Autowired
	ILocalidadDAO localidadDAOImp;
	
	@Override
	public void crearLocalidad(Localidad localidad) {
		localidadDAOImp.save(localidad);
	}

	@Override
	public Localidad modificar(Localidad localidad) throws Exception {
		// TODO Auto-generated method stub
		Localidad localidadGuardar= encontrarLocalidad(localidad.getId());
		mapearLocalidad(localidad, localidadGuardar);
		return localidadDAOImp.save(localidadGuardar);
	}
	
	public void mapearLocalidad(Localidad desde, Localidad hacia) {
		hacia.setNombre(desde.getNombre());
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		localidadDAOImp.deleteById(id);
	}

	@Override
	public Iterable<Localidad> listarTodos() {
		// TODO Auto-generated method stub
		return localidadDAOImp.findAll();
	}

	@Override
	public Localidad encontrarLocalidad(Long id) throws Exception {
		// TODO Auto-generated method stub
		return localidadDAOImp.findById(id).orElseThrow(()->new Exception("El usuario no exixte"));
	}

}
