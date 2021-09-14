package com.springboot.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.controller.models.domain.Categoria;
import com.springboot.app.controller.models.domain.Libro;

@Service
public class LibroServiceImpl implements LibroService {

	private List<Libro> listaLibros;

	public LibroServiceImpl() {
		this.listaLibros = new  ArrayList<>();

	}

	@Override
	public List<Libro> listar() {

		return listaLibros;
	}

	@Override
	public Libro obtenerPorId(Integer id) {
		Libro resultado = null;

		for (Libro libro : this.listaLibros) {
			if (id == libro.getId()) {
				resultado = libro;
				break;
			}
		}
		return resultado;
	}


	@Override
	public void eliminarLibro(Integer id) {
				
		for (Libro libro : this.listaLibros) {
			if (id == libro.getId()) {
				System.out.println(listaLibros.remove(libro));
			}
			break;
			}

	}

	@Override
	public void crearLibro(Libro libro) {
		
		System.out.println(libro.getId());
		
				this.listaLibros.add(libro);
		
	}

	@Override
	public void aditarLibro(Libro libro) {
		

		for (Libro lib : this.listaLibros) {
			if (libro.getId() == lib.getId()) {
				
				lib.setTitulo(libro.getTitulo());
				lib.setDescripcion(libro.getDescripcion());
				lib.setAnno(libro.getAnno());
				lib.setIsbn(libro.getIsbn());
				lib.setNumeroPaginas(libro.getNumeroPaginas());
			}
		}
	}

}
