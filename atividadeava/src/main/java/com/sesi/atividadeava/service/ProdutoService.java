package com.sesi.atividadeava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesi.atividadeava.model.Produto;
import com.sesi.atividadeava.repository.ProdutoRepository;

@Service 
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> listarProdutos() {
		return produtoRepository.findAll();
	}
	
	public Produto salvarPorduto(Produto produto) {
		return produtoRepository.save(produto);
	}

}
