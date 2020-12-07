package com.app.productos.service.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.productos.service.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
