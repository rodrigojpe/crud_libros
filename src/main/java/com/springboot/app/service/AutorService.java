package com.springboot.app.service;

import java.util.List;


import com.springboot.app.controller.models.domain.Autor;

public interface AutorService {
	
	
	public List<Autor> listar();
	
	public Autor obtenerPorId(Integer id);
	
	public void eliminarAutor();
	
	public void crearAutor(Autor autor);

}
