package io.github.ivoaragao.vendasapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.ivoaragao.vendasapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
