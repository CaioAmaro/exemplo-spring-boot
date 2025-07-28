package com.amaro.exemplo_spring_boot.service;

import com.amaro.exemplo_spring_boot.model.Produto;
import com.amaro.exemplo_spring_boot.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    //CREATE
    public void inserirProduto(Produto produto){
        produtoRepository.save(produto);
    }

    //READ
    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    //UPDATE
    public void atualizarProduto(Produto produto){
        produtoRepository.save(produto);
    }

    //DELETE
    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }
}
