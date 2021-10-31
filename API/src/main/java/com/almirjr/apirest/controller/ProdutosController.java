package com.almirjr.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.almirjr.apirest.modelos.Produto;
import com.almirjr.apirest.repositorio.ProdutoRepositorio;

@RestController
@RequestMapping(value="/serv")
public class ProdutosController {

	@Autowired
	ProdutoRepositorio ProdutoRepositorio;
	
	@GetMapping("/produtos")
	public List<Produto> listaProdutos(){
		return ProdutoRepositorio.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Produto MostraProduto(@PathVariable(value="id") long id){
		return ProdutoRepositorio.findById(id);
	}
	
	@PostMapping("/produto")
	public Produto adicionaProduto (@RequestBody Produto produto) {
		return ProdutoRepositorio.save(produto);
		
	}
	
}
