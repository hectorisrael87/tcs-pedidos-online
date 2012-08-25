package com.tcs.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * Bean con los atributos correspondientes a los campos de la tabla de base
 * de datos.
 * @author chuidiang
 */
public abstract class Persona {
	
	private int id;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private String domicilio;
	private String localidad;
	private Boolean sexo;
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Boolean getSexo() {
		return sexo;
	}

	public void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}

	public static SimpleDateFormat getFormateador() {
		return formateador;
	}

	public static void setFormateador(SimpleDateFormat formateador) {
		Persona.formateador = formateador;
	}

	/** Para poder escribir el bean en pantalla de forma rápida */
	public String toString()
	{
		return ""+id+" "+nombre+" "+formateador.format(fechaNacimiento);
	}
	
	/** Para escribir las fechas en un formato más mejor */
	private static SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");

	public Persona(int id, String nombre, String apellido,
			Date fechaNacimiento, String domicilio, String localidad,
			Boolean sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.sexo = sexo;
	}

	
	
	
	
}