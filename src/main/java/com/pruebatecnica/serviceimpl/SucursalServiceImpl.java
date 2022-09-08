package com.pruebatecnica.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnica.dao.SucursalDao;
import com.pruebatecnica.repository.SucursalRepository;
import com.pruebatecnica.service.SucursalService;

@Service
public class SucursalServiceImpl implements SucursalService {

	@Autowired
	SucursalRepository sucursalrepository;

	@Override
	public List<SucursalDao> getAll() {
		return (List<SucursalDao>) sucursalrepository.findAll();
	}

	@Override
	public SucursalDao getById(Integer id) {
		return sucursalrepository.findById(id).get();
	}

	@Override
	public SucursalDao save(SucursalDao sucursal) {
		return sucursalrepository.save(sucursal);
	}

}
