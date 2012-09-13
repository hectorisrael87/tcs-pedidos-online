package com.tcs.dao;

import java.util.List;

import com.tcs.model.Article;
import com.tcs.model.Brand;

public interface BrandDao {

	public void saveBrand(Brand Brand);

	public List<Brand> listBrands();

	public Brand getBrand(int ID);
}
