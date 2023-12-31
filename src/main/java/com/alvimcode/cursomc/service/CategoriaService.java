package com.alvimcode.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvimcode.cursomc.domain.Categoria;
import com.alvimcode.cursomc.repositories.CategoriaRepository;
import com.alvimcode.cursomc.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
				return obj.orElseThrow(() -> new ObjectNotFoundException(
						"Objeto não encontrado! Id: " + id + ", tipo: " + Categoria.class.getName()));
	}
}
