package com.pruebatecnica.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnica.dao.ProductosDao;
import com.pruebatecnica.repository.ProductosRepository;
import com.pruebatecnica.service.ProductosService;

@Service
public class ProductosServiceImpl implements ProductosService {

	@Autowired
	ProductosRepository productosrepository;

	@Override
	public List<ProductosDao> getAll() {
		return (List<ProductosDao>) productosrepository.findAll();
	}

	@Override
	public ProductosDao getById(Integer id) {
		return productosrepository.findById(id).get();
	}

	@Override
	public ProductosDao save(ProductosDao producto) {
		return productosrepository.save(producto);
	}

}
