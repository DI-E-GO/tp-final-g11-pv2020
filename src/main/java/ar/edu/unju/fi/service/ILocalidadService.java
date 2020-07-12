package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Localidad;

public interface ILocalidadService {

	public void crearLocalidad(Localidad localidad);
	public Localidad modificar(Localidad localidad) throws Exception;
	public void eliminar(Long id);
	public Iterable<Localidad> listarTodos();
	public Localidad encontrarLocalidad(Long id) throws Exception;
}
