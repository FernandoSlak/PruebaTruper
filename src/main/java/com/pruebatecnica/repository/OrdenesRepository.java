package com.pruebatecnica.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebatecnica.dao.OrdenesDao;

@Repository
public interface OrdenesRepository extends CrudRepository<OrdenesDao, Integer> {

}
