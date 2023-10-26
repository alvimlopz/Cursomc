package com.alvimcode.cursomc;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.alvimcode.cursomc.domain.Categoria;
import com.alvimcode.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
@ComponentScan(basePackages = "com.alvimcode.cursomc")
public class CursomcApplication implements CommandLineRunner{
	
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
		
	}

}
