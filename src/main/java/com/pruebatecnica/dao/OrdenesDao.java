package com.pruebatecnica.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordenes", schema="public")
public class OrdenesDao {

	@Id
	@Column(name = "order_id")
	public int order_id;

	@Column(name = "sucursal_id")
	public int sucursal_id;
	
	@Column(name= "fecha")
	public Date fecha;
	
	@Column(name= "total")
	public Double total;

}
