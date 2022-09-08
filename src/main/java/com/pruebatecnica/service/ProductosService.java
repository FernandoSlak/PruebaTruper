package com.pruebatecnica.service;

import java.util.List;

import com.pruebatecnica.dao.ProductosDao;

public interface ProductosService {

	public List<ProductosDao> getAll();
	
	public ProductosDao getById(Integer id);
	
	public ProductosDao save(ProductosDao producto);
}
