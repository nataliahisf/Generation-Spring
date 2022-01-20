package br.org.generationalune.blogpessoal.repository;

/*Class -> executa uma tarefa, tem ações dentro das classes (como o get and set)

Interface -> apenas dita mas não manda executar nada, (exemplo "public List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);" do Repository).*/

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generationalune.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>
{
	public List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	
	/* Equivalente a: select * from tb_postagens where titulo like "%titulo%"; 
	 o "IgnoreCase" é apenas para que ele ignore maiúsculas e minúsculas*/
}
