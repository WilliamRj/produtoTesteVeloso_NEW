package br.edu.infnet.produtoteste.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.produtoteste.controller.dto.ClienteDTO;
import br.edu.infnet.produtoteste.controller.repository.ClienteRepository;


@Service
public class ClienteService {

	
	@Autowired
    public ClienteRepository clienteRepository;

	   public List<ClienteDTO> getAll() {
	        return (List<ClienteDTO>) clienteRepository.findAll();
	    }
	   public ClienteDTO save(ClienteDTO cliente) {
		  return clienteRepository.save(cliente);
	   }
}