package com.alvimcode.cursomc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.alvimcode.cursomc")
public class CursomcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

}
