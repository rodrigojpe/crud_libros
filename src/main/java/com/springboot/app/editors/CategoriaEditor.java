package com.springboot.app.editors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.app.service.CategoriaService;


@Component
public class CategoriaEditor extends PropertyEditorSupport {
	
	
	@Autowired
	private CategoriaService service;

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		if (text != null && text.length() > 0) {
			try {
				Integer id = Integer.parseInt(text);
				this.setValue(service.obtenerPorId(id));
			} catch (NumberFormatException ex) {
				setValue(null);
			}
		} else {
			setValue(null);
		}

}
}	
