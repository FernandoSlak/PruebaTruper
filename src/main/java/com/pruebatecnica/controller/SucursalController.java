package com.pruebatecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.dao.SucursalDao;
import com.pruebatecnica.serviceimpl.SucursalServiceImpl;

@RestController
public class SucursalController {

	@Autowired
	private SucursalServiceImpl sucursalService;
	
	@GetMapping(value="/FindAllSucursales", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<SucursalDao> findAllOrdenes() {
		return sucursalService.getAll();
	}

	@GetMapping(value="/FindByIdSucursal/{idSucursal}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public SucursalDao findAllOrdenes(@PathVariable Integer idSucursal) {
		return sucursalService.getById(idSucursal);
	}

	@PostMapping(value="/SaveSucursal", produces = {MediaType.APPLICATION_JSON_VALUE})
	public SucursalDao saveOrden(@RequestBody SucursalDao sucursal) {
		return sucursalService.save(sucursal);
	}
}
