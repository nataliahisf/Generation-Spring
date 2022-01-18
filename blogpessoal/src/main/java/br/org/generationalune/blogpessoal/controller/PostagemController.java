package br.org.generationalune.blogpessoal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import br.org.generationalune.blogpessoal.model.Postagem;
import br.org.generationalune.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins="*", allowedHeaders="*") //receber do front o endereço
public class PostagemController 
{
	//injeção de dependencia
	@Autowired
	private PostagemRepository postagemRepository; //p minúsculo: nome do objeto, transfere para o Spring a responsabilidade de criar o objeto
	@GetMapping
	public ResponseEntity <List<Postagem>> getAll()
	{
		return ResponseEntity.ok(postagemRepository.findAll()); //tudo isso representa um select, como "select from" da tabela postagem
	}
}
