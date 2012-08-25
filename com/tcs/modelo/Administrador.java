package com.tcs.modelo;

import java.util.Date;

public class Administrador extends Persona {

	private String nombreUsuario;
	private String password;

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

	public Administrador(int id, String nombre, String apellido,
			Date fechaNacimiento, String domicilio, String localidad,
			Boolean sexo, String nombreUsuario, String password) {
		super(id, nombre, apellido, fechaNacimiento, domicilio, localidad, sexo);
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}

}
