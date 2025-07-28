package com.amaro.exemplo_spring_boot.controller;

import com.amaro.exemplo_spring_boot.model.Produto;
import com.amaro.exemplo_spring_boot.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    //CREATE
    @PostMapping
    public void inserirProduto(@RequestBody Produto produto){
        produtoService.inserirProduto(produto);
    }

    //READ
    @GetMapping
    public List<Produto> listarProdutos(){
        return produtoService.listarProdutos();
    }

    //UPDATE
    @PutMapping
    public void atualizarProduto(@RequestBody Produto produto){
        produtoService.atualizarProduto(produto);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
    }
}
