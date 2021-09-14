package com.springboot.app.service;

import java.util.List;

import com.springboot.app.controller.models.domain.Categoria;

public interface CategoriaService {

	public List<Categoria> listar();

	public Categoria obtenerPorId(Integer id);

	public void eliminarCategoria();

	public void crearCategoria(Categoria categoria);

}
