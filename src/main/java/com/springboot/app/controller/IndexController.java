package com.springboot.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


import com.springboot.app.controller.models.domain.Autor;
import com.springboot.app.controller.models.domain.Categoria;
import com.springboot.app.controller.models.domain.Libro;
import com.springboot.app.editors.AutorEditor;
import com.springboot.app.editors.CategoriaEditor;
import com.springboot.app.service.AutorService;
import com.springboot.app.service.CategoriaService;
import com.springboot.app.service.LibroService;

@Controller
@SessionAttributes("libro")
public class IndexController {

	@Autowired
	private LibroService libroService;

	@Autowired
	private CategoriaService categoriaService;

	@Autowired
	private AutorService autorService;
	
	@Autowired
	private AutorEditor autorEditor;
	
	@Autowired
	private CategoriaEditor categoriaEditor;
	

	@GetMapping({ "/", "", "/index" })
	public String index(Model model) {

		model.addAttribute("saludo", "Hola mundo desde model");
		return "index";
	}
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		binder.registerCustomEditor(Autor.class, "autor" , autorEditor);
		binder.registerCustomEditor(Categoria.class, "categoria" , categoriaEditor);
	}
	
	@GetMapping({ "/crearLibro" })
	public String crearLirbo(Model model) {

		Libro libro = new Libro();

		model.addAttribute("libro", libro);
		return "crearLibro";
	}
	
	

	@PostMapping("/form")
	public String procesaFormulario(@Valid Libro libro, BindingResult result, Model model, SessionStatus status) {
		
		System.out.println(libro.getId());
		
		
		System.out.println("hola");
		/*if (result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "form";

		}*/

		model.addAttribute("titulo", "Resultado del Formulario");
		return "redirect:/ver";
	}
	
	@GetMapping("/ver")
	public String ver(@SessionAttribute(name= "libro", required = false ) Libro libro, Model model, SessionStatus status) {
		
		if(libro == null) {
			return "redirect:/index";
		}
		
		status.setComplete();
		return "index";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@SessionAttribute(name= "libro", required = false ) Libro libro  ,@PathVariable Integer id, Model model) {
		model.addAttribute("titulo", "Recibir parametros de la ruta (@PathVariable)");
		model.addAttribute("resultado", "El numero es : "+ id);
		
		libro =  libroService.obtenerPorId(id);
		
		System.out.println(libro.getTitulo());
		
		  model.addAttribute("libro", libroService.obtenerPorId(id));
		return "modificar/ver";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@SessionAttribute(name= "libro", required = false ) Libro libro  ,@PathVariable Integer id, Model model) {
		
		
		libroService.eliminarLibro(id);
		
		 // model.addAttribute("libro", libroService.obtenerPorId(id));
		return "index";
	}
	
	@PostMapping("/edit")
	public String edit(@Valid Libro libro, BindingResult result, Model model, SessionStatus status) {
		
		
		libroService.aditarLibro(libro);
		System.out.println(libro);
		
		return "index";
		
	}
	

	@ModelAttribute("libroLista")
	public List<Libro> listaLibros() {

		return libroService.listar();

	}

	@ModelAttribute("listaCategoria")
	public List<Categoria> listaCategorias() {

		return categoriaService.listar();

	}

	@ModelAttribute("listaAutor")
	public List<Autor> listaAutor() {

		return autorService.listar();

	}

	

}
