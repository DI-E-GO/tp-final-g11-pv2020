package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Localidad;

public interface ILocalidadDAO {
	public void guardar();
	public Localidad mostrar();
	public void eliminar();
	public Localidad modificar();
}
