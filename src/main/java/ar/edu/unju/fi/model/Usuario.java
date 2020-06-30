package ar.edu.unju.fi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NOMBRE_USU", length = 20, nullable = true)
	private String nombreUsuario;
	@Column(name = "PASSWORD", length = 20, nullable = true)
	private String password;
	@Column(name = "NOMBRE", length = 100, nullable = true)
	private String nombreReal;
	@Column(name = "APELLIDO", length = 100, nullable = true)
	private String apellidoReal;
	@Column(name = "TIPO_USU", length = 20, nullable = true)
	private String tipoUsuario;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombreReal() {
		return nombreReal;
	}

	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}

	public String getApellidoReal() {
		return apellidoReal;
	}

	public void setApellidoReal(String apellidoReal) {
		this.apellidoReal = apellidoReal;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}