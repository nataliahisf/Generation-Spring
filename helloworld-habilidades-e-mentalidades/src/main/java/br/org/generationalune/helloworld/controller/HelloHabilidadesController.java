package br.org.generationalune.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellohabilidades")
public class HelloHabilidadesController 
{
	@GetMapping
	public String hellohabilidades()
	{
		return "Hello World criado com as habilidades e mentalidade de persistência e atenção aos detalhes";
	}
	
}

//http://localhost:8080/helloworld
