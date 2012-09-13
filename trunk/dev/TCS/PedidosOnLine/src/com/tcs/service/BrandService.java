package com.tcs.service;

import java.util.List;

import com.tcs.model.Brand;

public interface BrandService {
	
	public void addBrand (Brand brand);
	
	public List<Brand> listBrands ();
	
	public Brand getBrand (int ID);

}
