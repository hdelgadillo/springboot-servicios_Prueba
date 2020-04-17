package com.hugo.com.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.hugo.com.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
