package com.amaro.exemplo_spring_boot.repository;

import com.amaro.exemplo_spring_boot.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}