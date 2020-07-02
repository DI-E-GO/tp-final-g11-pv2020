package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Tripulante;

public interface ITripulanteDAO {
	public void guardar();
	public Tripulante mostrar();
	public Tripulante modificar();
}
