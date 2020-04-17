package com.hugo.com.models.service;

import java.util.List;

import com.hugo.com.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto>findAll();
	public Producto findById(Long id);
	
}
