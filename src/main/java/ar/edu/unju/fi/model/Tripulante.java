package ar.edu.unju.fi.model;

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

@Entity
@Table(name = "tripulantes")
public class Tripulante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID")
	private Long id;
	@Column(name = "DNI", length = 8, nullable = true)
	private String documento;
	@Column(name = "APELLIDO", length = 20, nullable = true)
	private String apellido;
	@Column(name = "NOMBRE", length = 100, nullable = true)
	private String nombres;
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

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
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