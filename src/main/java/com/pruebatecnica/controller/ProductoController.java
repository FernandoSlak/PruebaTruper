package com.pruebatecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.dao.ProductosDao;
import com.pruebatecnica.serviceimpl.ProductosServiceImpl;

@RestController
public class ProductoController {

	@Autowired
	private ProductosServiceImpl productosService;
	
	@GetMapping(value="/FindAllProductos", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<ProductosDao> findAllOrdenes() {
		return productosService.getAll();
	}

	@GetMapping(value="/FindByIdProducto/{idProducto}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ProductosDao findAllOrdenes(@PathVariable Integer idProducto) {
		return productosService.getById(idProducto);
	}

	@PostMapping(value="/SaveProducto", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ProductosDao saveOrden(@RequestBody ProductosDao producto) {
		return productosService.save(producto);
	}

	@PostMapping(value="/UpdateProducto", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ProductosDao updateOrden(@RequestBody ProductosDao producto) {
		return productosService.save(producto);
	}
}
