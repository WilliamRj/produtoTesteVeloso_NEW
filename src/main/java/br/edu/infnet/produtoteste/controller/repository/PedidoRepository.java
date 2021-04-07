package br.edu.infnet.produtoteste.controller.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.produtoteste.controller.dto.PedidoDTO;

public interface PedidoRepository extends CrudRepository<PedidoDTO,Long>{
	

}
