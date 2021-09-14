package com.springboot.app.controller.models.domain;

import java.util.List;

public class Autor {
	
	private Integer id;
	private String nombre;
	private String apellido;
	private String nacionalidad;
	private String fechaNacimiento;
	private String seudonimo;
	private List<Libro> listaLibros;
	

	public Autor(Integer id, String nombre, String apellido, String nacionalidad, String fechaNacimiento,
			String seudonimo, List<Libro> listaLibros) {

		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.fechaNacimiento = fechaNacimiento;
		this.seudonimo = seudonimo;
		this.listaLibros = listaLibros;
	}

	public Autor() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSeudonimo() {
		return seudonimo;
	}

	public void setSeudonimo(String seudonimo) {
		this.seudonimo = seudonimo;
	}

	public List<Libro> getListaLibrosM() {
		return listaLibros;
	}

	public void setListaLibrosM(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	

}
