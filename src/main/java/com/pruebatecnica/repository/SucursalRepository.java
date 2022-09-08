package com.pruebatecnica.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebatecnica.dao.SucursalDao;

@Repository
public interface SucursalRepository extends CrudRepository<SucursalDao, Integer> {

}
