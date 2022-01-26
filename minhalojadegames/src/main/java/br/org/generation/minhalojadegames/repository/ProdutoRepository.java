package br.org.generation.minhalojadegames.repository;

import java.util.List;
import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.minhalojadegames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>

{
public List <Produto> findAllByNomeContainingIgnoreCase(String nome); //Busca todos os Produtos cujo o preço seja maior do que um valor digitado ordenado pelo preço em ordem crescente

public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco); //Busca todos os Produtos cujo o preço seja menor do que um valor digitado ordenado pelo preço em ordem decrescente

public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
}