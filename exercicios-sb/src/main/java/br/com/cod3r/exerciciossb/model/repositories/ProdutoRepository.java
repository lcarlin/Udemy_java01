package br.com.cod3r.exerciciossb.model.repositories;

// import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cod3r.exerciciossb.model.entities.Produto;

public interface ProdutoRepository 
// extends CrudRepository<Produto, Integer> 
extends PagingAndSortingRepository<Produto, Integer>
        {
	public Iterable <Produto > findByNomeContainingIgnoreCase(String parteNome);

}
