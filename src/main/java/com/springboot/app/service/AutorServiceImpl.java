package com.springboot.app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.controller.models.domain.Autor;

@Service
public class AutorServiceImpl implements AutorService {
	
	
	private List<Autor> listAutor;
	
	public AutorServiceImpl() {
		
		this.listAutor = Arrays.asList(
				new Autor(1,"Rodrigo","jeldes","chileno",null,"pepe",null),
				new Autor(2,"Elmo","Jhon","chileno",null,"mojojojo",null)
				);
				
		
	}

	@Override
	public List<Autor> listar() {
		// TODO Auto-generated method stub
		return listAutor;
	}

	@Override
	public Autor obtenerPorId(Integer id) {
		Autor resultado = null;

		for (Autor autor : this.listAutor) {
			if (id == autor.getId()) {
				resultado = autor;
				break;
			}
		}
		return resultado;
	}

	@Override
	public void eliminarAutor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearAutor(Autor autor) {
		// TODO Auto-generated method stub
		
	}

}
