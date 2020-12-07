package com.app.productos.service.models.service;

import java.util.List;

import com.app.productos.service.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
}
