package com.pruebatecnica.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebatecnica.dao.ProductosDao;

@Repository
public interface ProductosRepository extends CrudRepository<ProductosDao, Integer> {

}
