package com.sesi.atividadeava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.atividadeava.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	

}
