package ar.edu.unju.fi.repository;

import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.fi.model.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{

}
