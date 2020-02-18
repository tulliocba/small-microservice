package com.github.tulliocba.fornecedor.repository;

import java.util.List;

import com.github.tulliocba.fornecedor.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

	List<Produto> findByEstado(String estado);
	
	List<Produto> findByIdIn(List<Long> ids);
}
