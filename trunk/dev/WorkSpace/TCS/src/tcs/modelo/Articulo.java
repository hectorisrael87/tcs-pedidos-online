package com.tcs.modelo;

public class Articulo {

	private int idArticulo;
	private String nombre;
	private float precio;
	private Marca marca;
	private String descripcion;

	public int getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Articulo(int idArticulo, String nombre, float precio, Marca marca,
			String descripcion) {
		super();
		this.idArticulo = idArticulo;
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
		this.descripcion = descripcion;
	}

	public Articulo() {
		super();
	}

}