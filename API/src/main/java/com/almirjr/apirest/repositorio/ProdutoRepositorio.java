package com.almirjr.apirest.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import com.almirjr.apirest.modelos.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{
	Produto findById(long id);

}
