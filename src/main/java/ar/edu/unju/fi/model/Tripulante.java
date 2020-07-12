package ar.edu.unju.fi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "tripulantes")
public class Tripulante implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID")
	private Long id;
	@Column(name = "DNI", length = 8, nullable = true)
	private String documento;
	@Column(name = "APELLIDO", length = 20, nullable = true)
	private String apellido;
	@Column(name = "NOMBRE", length = 100, nullable = true)
	private String nombre;
	@Column(name = "NACIONALIDAD", length = 50, nullable = true)
	private String nacionalidad;
	@Autowired
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REGISTRO_ID")
	private RegistroTracking registro;
	
	public Tripulante() {
		// TODO Auto-generated constructor stub
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombres) {
		this.nombre = nombres;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
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
