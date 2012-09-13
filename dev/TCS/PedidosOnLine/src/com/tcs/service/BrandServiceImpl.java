package com.tcs.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.dao.BrandDao;
import com.tcs.model.Brand;

@Service("brandService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BrandServiceImpl implements BrandService {

	@Resource
	private BrandDao brandDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addBrand(Brand brand) {
		brandDao.saveBrand(brand);

	}

	public List<Brand> listBrands() {

		return brandDao.listBrands();
	}

	public Brand getBrand(int ID) {

		return brandDao.getBrand(ID);
	}

}
