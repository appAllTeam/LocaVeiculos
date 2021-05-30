package com.faculdadedelta.repository;

import org.springframework.data.repository.CrudRepository;

import com.faculdadedelta.modelo.PedidoItens;

public interface PedidoItensRepository extends CrudRepository<PedidoItens, String>{
	PedidoItens findById (int id);

}
