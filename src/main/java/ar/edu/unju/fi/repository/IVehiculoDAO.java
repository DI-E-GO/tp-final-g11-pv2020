package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Vehiculo;

public interface IVehiculoDAO {
	public void guardar();
	public Vehiculo mostrar();
	public Vehiculo modificar();
}
