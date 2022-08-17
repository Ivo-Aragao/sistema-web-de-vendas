package io.github.ivoaragao.vendasapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.ivoaragao.vendasapi.model.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{

}
