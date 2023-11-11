package com.alvimcode.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.alvimcode.cursomc.domain.Categoria;
import com.alvimcode.cursomc.domain.Cidade;
import com.alvimcode.cursomc.domain.Estado;
import com.alvimcode.cursomc.domain.Produto;
import com.alvimcode.cursomc.repositories.CategoriaRepository;
import com.alvimcode.cursomc.repositories.CidadeRepository;
import com.alvimcode.cursomc.repositories.EstadoRepository;
import com.alvimcode.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
@ComponentScan(basePackages = "com.alvimcode.cursomc")
public class CursomcApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategoria().addAll(Arrays.asList(cat1));
		p2.getCategoria().addAll(Arrays.asList(cat1, cat2));
		p3.getCategoria().addAll(Arrays.asList(cat1));
		
		Estado est1 = new Estado(null, "minas Gerais", null);
		Estado est2 = new Estado(null, "Para", null);
		
		Cidade c1 = new Cidade();
		Cidade c2 = new Cidade();
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		
	}

}
