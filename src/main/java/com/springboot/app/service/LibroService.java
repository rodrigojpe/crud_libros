package com.springboot.app.service;

import java.util.List;


import com.springboot.app.controller.models.domain.Libro;

public interface LibroService {
	
	
	
	public List<Libro> listar();
	
	public Libro obtenerPorId(Integer id);
	
	public void eliminarLibro(Integer id);
	
	public void crearLibro(Libro libro);
	
	public void aditarLibro(Libro libro);


}
