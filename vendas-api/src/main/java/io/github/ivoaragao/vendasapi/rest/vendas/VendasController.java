package io.github.ivoaragao.vendasapi.rest.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ivoaragao.vendasapi.model.Venda;
import io.github.ivoaragao.vendasapi.model.repository.ItemVendaRepository;
import io.github.ivoaragao.vendasapi.model.repository.VendaRepository;

@RestController
@RequestMapping("/api/vendas")
@CrossOrigin("*")
public class VendasController {

	@Autowired
	private VendaRepository repository;
	@Autowired
	private ItemVendaRepository itemVendaRepository;
	
	@PostMapping
	@Transactional
	public void realizarVenda( @RequestBody Venda venda) {
		repository.save(venda);
		venda.getItens().stream().forEach( iv -> iv.setVenda(venda));
		itemVendaRepository.saveAll(venda.getItens());
	}
}