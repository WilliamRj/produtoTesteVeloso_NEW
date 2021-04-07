package br.edu.infnet.produtoteste.controller.repository;

import org.springframework.data.repository.CrudRepository;
import br.edu.infnet.produtoteste.controller.dto.ClienteDTO;

public interface ClienteRepository extends CrudRepository<ClienteDTO,Long>{

}
