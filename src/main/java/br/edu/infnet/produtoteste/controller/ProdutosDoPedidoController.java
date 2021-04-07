package br.edu.infnet.produtoteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.produtoteste.controller.dto.ProdutosDoPedidoDTO;
import br.edu.infnet.produtoteste.controller.service.ProdutosDoPedidoService;


@RestController
@RequestMapping("/produtos")
public class ProdutosDoPedidoController {



    @Autowired
    private ProdutosDoPedidoService produtosDoPedidoservice;

    @GetMapping	
    public List<ProdutosDoPedidoDTO> getCostumers() {
    	return produtosDoPedidoservice.getAll();
    }
    
    @PostMapping
    public ProdutosDoPedidoDTO storeUser(@RequestBody ProdutosDoPedidoDTO costumer) {
    	return produtosDoPedidoservice.save(costumer);
    }
}