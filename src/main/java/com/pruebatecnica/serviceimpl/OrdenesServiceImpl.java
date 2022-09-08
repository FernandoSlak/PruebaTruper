package com.pruebatecnica.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnica.dao.OrdenesDao;
import com.pruebatecnica.repository.OrdenesRepository;
import com.pruebatecnica.service.OrdenesService;

@Service
public class OrdenesServiceImpl implements OrdenesService {

	@Autowired
	OrdenesRepository ordenesrepository;
	
	@Override
	public List<OrdenesDao> getAll() {
		return (List<OrdenesDao>) ordenesrepository.findAll();
	}

	@Override
	public OrdenesDao getById(Integer id) {
		return ordenesrepository.findById(id).get();
	}

	@Override
	public OrdenesDao save(OrdenesDao ordenes) {
		return ordenesrepository.save(ordenes);
	}

}
