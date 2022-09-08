package com.pruebatecnica.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "sucursales")
public class SucursalDao {

	@Id
	@Column(name = "sucursal_id")
	public int sucursal_id;
	
	@Column(name= "nombre")
	public String nombre;

}
