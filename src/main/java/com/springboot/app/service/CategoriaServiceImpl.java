package com.springboot.app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.controller.models.domain.Autor;
import com.springboot.app.controller.models.domain.Categoria;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	
	private List<Categoria> listCategoria;
	

	public CategoriaServiceImpl() {
		
		this.listCategoria = Arrays.asList(
				
				new Categoria(1, "Informatica", null),
				new Categoria(2, "Base de datos", null),
				new Categoria(3, "sql", null)
				);
		
	}

	@Override
	public List<Categoria> listar() {

		return listCategoria;
	}

	@Override
	public Categoria obtenerPorId(Integer id) {
		Categoria resultado = null;

		for (Categoria categoria : this.listCategoria) {
			if (id == categoria.getId()) {
				resultado = categoria;
				break;
			}
		}
		return resultado;
	}

	@Override
	public void eliminarCategoria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

}
