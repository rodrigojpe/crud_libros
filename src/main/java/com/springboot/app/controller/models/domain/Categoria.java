package com.springboot.app.controller.models.domain;

import java.util.List;

public class Categoria {
	
	
	
	private Integer id;
	
	private String descripcion;
	
	private List<Libro> listaLibros;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	public Categoria() {

	}

	public Categoria(Integer id, String descripcion, List<Libro> listaLibros) {

		this.id = id;
		this.descripcion = descripcion;
		this.listaLibros = listaLibros;
	}
	
	
	
	

}
