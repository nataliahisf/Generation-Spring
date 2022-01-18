package br.org.generationalune.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generationalune.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem,Long>
{

}
