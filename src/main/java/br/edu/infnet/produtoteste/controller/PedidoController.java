package br.edu.infnet.produtoteste.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.produtoteste.controller.dto.PedidoDTO;
import br.edu.infnet.produtoteste.controller.service.PedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
    private PedidoService PedidoService;

    @GetMapping	
    public List<PedidoDTO> getCostumers() {
    	return PedidoService.getAll();
    }
    
    @PostMapping
    public PedidoDTO storeUser(@RequestBody PedidoDTO order) {
    	return PedidoService.save(order);
    }
}