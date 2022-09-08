package com.pruebatecnica.service;

import java.util.List;

import com.pruebatecnica.dao.OrdenesDao;

public interface OrdenesService {

	public List<OrdenesDao> getAll();
	
	public OrdenesDao getById(Integer id);
	
	public OrdenesDao save(OrdenesDao ordenes);
}
