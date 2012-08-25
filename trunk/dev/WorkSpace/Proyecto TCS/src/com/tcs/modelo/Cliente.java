package com.tcs.modelo;

import java.util.Date;

public class Cliente extends Persona {


	private String nombreCliente;
	private String password;
	private String cuit;
	
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCuit() {
		return cuit;
	}
	
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	public Cliente(int id, String nombre, String apellido,
			Date fechaNacimiento, String domicilio, String localidad,
			Boolean sexo, String nombreCliente, String password, String cuit) {
		super(id, nombre, apellido, fechaNacimiento, domicilio, localidad, sexo);
		this.nombreCliente = nombreCliente;
		this.password = password;
		this.cuit = cuit;
	}
	
	
	
}
