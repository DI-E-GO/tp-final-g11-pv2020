package ar.edu.unju.fi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "localidades")
public class Localidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID")
	private Long id;
	@Column(name = "NOMBRE_LOC", length = 100, nullable = true)
	private String nombre;
	
	@OneToOne(mappedBy = "localidad", fetch = FetchType.LAZY)
	private RegistroTracking registro;
	
	public Localidad() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RegistroTracking getRegistro() {
		return registro;
	}

	public void setRegistro(RegistroTracking registro) {
		this.registro = registro;
	}
	
}
