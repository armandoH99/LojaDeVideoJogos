package com.generation.LojaDeVideoJogos.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.LojaDeVideoJogos.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List <Produto> findByPrecoLessThan(BigDecimal preco);
    
    public List <Produto> findByPrecoGreaterThan(BigDecimal preco);
    
    public List <Produto> findAllByDescricaoContainingIgnoreCase (@Param("descricao") String descricao);

    public List <Produto> findAllByNomeContainingIgnoreCase (@Param("nome") String nome);
    
	public boolean existsById(BigDecimal preco);
}
