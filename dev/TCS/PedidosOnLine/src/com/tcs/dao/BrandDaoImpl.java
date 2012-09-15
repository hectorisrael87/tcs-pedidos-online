package com.tcs.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.model.Brand;

@Repository("brandDao")
public class BrandDaoImpl implements BrandDao {

	
	@Autowired
	private SessionFactory sessionFactory;

	
	public void saveBrand(Brand brand) {
		sessionFactory.getCurrentSession().saveOrUpdate(brand);
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Brand> listBrands() {		
		return (List<Brand>) sessionFactory.getCurrentSession().createCriteria(Brand.class).list();
	}
	
	public Brand getBrand(int ID) {
		Brand brand = (Brand)sessionFactory.getCurrentSession().createQuery("FROM Brand B WHERE B.brandId = "+ ID +"").uniqueResult();
		return  brand ;
	}
	
}

