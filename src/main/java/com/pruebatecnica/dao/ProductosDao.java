package com.pruebatecnica.dao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class ProductosDao {

	@Id
	@Column(name = "producto_id")
	public int producto_id;

	@Column(name = "order_id")
	public int order_id;
	
	@Column(name= "codigo")
	public String codigo;

	@Column(name= "descripcion")
	public String descripcion;
	
	@Column(name= "precio")
	public Double precio;
	

}