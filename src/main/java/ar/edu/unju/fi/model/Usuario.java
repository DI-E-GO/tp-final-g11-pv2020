package ar.edu.unju.fi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name="native", strategy = "native")
	@Column(name = "ID")
	private Long id;
	@Column(name = "NOMBRE_USU", length = 20, nullable = true)
	@NotNull
	@NotBlank
	private String nombreUsuario;
	@Column(name = "PASSWORD", length = 20, nullable = true)
	@NotBlank
	private String password;
	@Column(name = "NOMBRE", length = 100, nullable = true)
	@NotBlank(message = "Ingrese Nombre")
	private String nombreReal;
	@Column(name = "APELLIDO", length = 100, nullable = true)
	@NotBlank
	private String apellidoReal;
	@Column(name = "TIPO_USU")
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

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	 
}
