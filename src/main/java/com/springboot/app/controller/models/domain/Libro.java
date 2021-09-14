package com.springboot.app.controller.models.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Libro {
	
	
	private Integer id;
	
	
	private String titulo;
	
	private Autor autor;
	private Categoria categoria;
	private String descripcion;
	private Integer anno;
	
	private String isbn;
	private Integer numeroPaginas;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getAnno() {
		return anno;
	}
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public Libro() {

	}
	public Libro(Integer id, String titulo, Autor autor, Categoria categoria, String descripcion, Integer anno,
			String isbn, Integer numeroPaginas) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.anno = anno;
		this.isbn = isbn;
		this.numeroPaginas = numeroPaginas;
	}
	
	
	
	
	

}
