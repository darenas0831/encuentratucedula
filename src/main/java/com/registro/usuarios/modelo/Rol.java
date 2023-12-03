package com.registro.usuarios.modelo;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "registro_cedula_id")  // Ajusta según la columna en tu base de datos
	private RegistroCedula registroCedula;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public RegistroCedula getRegistroCedula() {
		return registroCedula;
	}

	public void setRegistroCedula(RegistroCedula registroCedula) {
		this.registroCedula = registroCedula;
	}



	public Rol(String nombre) {
		this.nombre = nombre;
	}

	public Rol(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Rol() {

	}
}
