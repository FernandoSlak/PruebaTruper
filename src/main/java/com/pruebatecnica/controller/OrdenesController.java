package com.pruebatecnica.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.dao.OrdenesDao;
import com.pruebatecnica.serviceimpl.OrdenesServiceImpl;

@RestController
public class OrdenesController {

	@Autowired
	private OrdenesServiceImpl ordenesService;
	
	@GetMapping(value="/FindAllOrdenes", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<OrdenesDao> findAllOrdenes() {
		return ordenesService.getAll();
	}

	@GetMapping(value="/FindByIdOrden/{idOrden}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public OrdenesDao findAllOrdenes(@PathVariable Integer idOrden) {
		return ordenesService.getById(idOrden);
	}

	@PostMapping(value="/SaveOrden", produces = {MediaType.APPLICATION_JSON_VALUE})
	public OrdenesDao saveOrden(@RequestBody OrdenesDao orden) {
		return ordenesService.save(orden);
	}
}
