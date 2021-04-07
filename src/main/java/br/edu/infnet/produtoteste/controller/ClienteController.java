package br.edu.infnet.produtoteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.produtoteste.controller.dto.ClienteDTO;
import br.edu.infnet.produtoteste.controller.service.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {



    @Autowired
    private ClienteService ClienteService;

    @GetMapping	
    public List<ClienteDTO> getCostumers() {
    	return ClienteService.getAll();
    }
    
    @PostMapping
    public ClienteDTO storeUser(@RequestBody ClienteDTO costumer) {
    	return ClienteService.save(costumer);
    }
}

