package br.edu.infnet.produtoteste.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.produtoteste.controller.dto.ProdutosDoPedidoDTO;
import br.edu.infnet.produtoteste.controller.repository.ProdutosDoPedidoRepository;

@Service
public class ProdutosDoPedidoService {

	
	@Autowired
    public ProdutosDoPedidoRepository produtosDoPedidoRepository;

	   public List<ProdutosDoPedidoDTO> getAll() {
	        return (List<ProdutosDoPedidoDTO>) produtosDoPedidoRepository.findAll();
	    }
	   public ProdutosDoPedidoDTO save(ProdutosDoPedidoDTO product) {
		  return produtosDoPedidoRepository.save(product);
	   }
}