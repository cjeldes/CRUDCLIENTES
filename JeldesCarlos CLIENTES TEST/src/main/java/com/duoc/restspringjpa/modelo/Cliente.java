package com.duoc.restspringjpa.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	@Id
	@Column(name = "rut")
	private String rut;

	@Column(name = "nombres")
	private String nombre;

	@Column(name = "apellidos")
	private String apellido;

	@Column(name = "email")
	private String email;

	@Column(name = "celular")
	private String celular;

	public Cliente() {
		super();
	}

	public Cliente(String rut, String nombre, String apellido, String email, String celular) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.celular = celular;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", celular=" + celular + "]";
	}

	public boolean equals(Cliente obj) {
		if (!(this.rut.equals(obj.rut)))
			return false;
		if (!(this.nombre.equals(obj.nombre)))
			return false;
		if (!(this.apellido.equals(obj.apellido)))
			return false;
		if (!(this.email.equals(obj.email)))
			return false;
		if (!(this.celular.equals(obj.celular)))
			return false;
		return true;
	}

}
