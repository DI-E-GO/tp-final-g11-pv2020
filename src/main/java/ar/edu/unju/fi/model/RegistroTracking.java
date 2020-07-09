package ar.edu.unju.fi.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "registro")
public class RegistroTracking implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID")
	private Long id;
	private LocalDate fechaHora;
	@Autowired
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "VEHICULO_ID")
	private Vehiculo vehiculo;
	@OneToMany(mappedBy = "registro", cascade = CascadeType.ALL)
	private List<Tripulante> tripulantes = new ArrayList<Tripulante>();
	@Autowired
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "LOCALIDAD_ID")
	private Localidad localidad;
	private String detalleLugarRegistro;
	
	public RegistroTracking() {
		// TODO Auto-generated constructor stub
	}

	public LocalDate getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDate fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public List<Tripulante> getTripulantes() {
		return tripulantes;
	}

	public void setTripulantes(List<Tripulante> tripulantes) {
		this.tripulantes = tripulantes;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public String getDetalleLugarRegistro() {
		return detalleLugarRegistro;
	}

	public void setDetalleLugarRegistro(String detalleLugarRegistro) {
		this.detalleLugarRegistro = detalleLugarRegistro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
