package com.faculdadedelta.repository;

import org.springframework.data.repository.CrudRepository;

import com.faculdadedelta.modelo.Produto;

public interface MovelRepository extends CrudRepository<Produto, String>{
	Produto findById (int id);
}
