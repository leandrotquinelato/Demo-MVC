package com.quinelato.curso.boot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.quinelato.curso.boot.domain.Cargo;
import com.quinelato.curso.boot.domain.Departamento;
import com.quinelato.curso.boot.service.CargoService;
import com.quinelato.curso.boot.service.DepartamentoService;

@Component
public class StringToCargoConverter implements Converter<String, Cargo> {

	@Autowired
	private CargoService service;
	
	@Override
	public Cargo convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}
