package br.org.generationalune.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloobjetivos")
public class HelloWorldObjetivos 
{
	@GetMapping
	public String helloobjetivos()
	{
		return "Meu objetivo essa semana é aprender mais sobre spring e codar melhor";
	}
	
}
