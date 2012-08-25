package com.tcs.modelo;

import java.util.ArrayList;
import java.util.List;

public class Marca {
	
	
	private int id;
    private String name;
    private List <Articulo> listArticulos;
    
    
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Articulo> getListArticulos() {
		return listArticulos;
	}
	
	public void setListArticulos(List<Articulo> listArticulos) {
		this.listArticulos = listArticulos;
	}
	
	public Marca(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.listArticulos = new ArrayList<>();
	}
	
	public Marca() {
		super();
	}

}
