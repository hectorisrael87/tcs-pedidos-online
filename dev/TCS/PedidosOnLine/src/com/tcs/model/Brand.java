package com.tcs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "brand")
public class Brand implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "brand_id", nullable = false)
	private long id;

	@Column(name = "brand_name", nullable = false)
	private String brandName;

	/*@OneToMany(mappedBy = "articleBrand", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	// EAGER indica que al momento de recuperar de la base de datos a la marca
	// se traen sus articulos.
	private List<Article> listArticulos = new ArrayList<Article>();*/
	
	@Column(name = "brand_desc")
	private String brandDesc;

	public Brand() {
		
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String name) {
		this.brandName = name;
	}

	/*public List<Article> getListArticulos() {
		return listArticulos;
	}

	public void setListArticulos(List<Article> listArticulos) {
		this.listArticulos = listArticulos;
	}*/

	public String getBrandDesc() {
		return brandDesc;
	}

	public void setBrandDesc(String brandDesc) {
		this.brandDesc = brandDesc;
	}

	public long getId() {
		return id;
	}

	

}
