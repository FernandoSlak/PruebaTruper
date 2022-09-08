package com.pruebatecnica.service;

import java.util.List;

import com.pruebatecnica.dao.SucursalDao;

public interface SucursalService {

	public List<SucursalDao> getAll();
	
	public SucursalDao getById(Integer id);
	
	public SucursalDao save(SucursalDao sucursal);
}
