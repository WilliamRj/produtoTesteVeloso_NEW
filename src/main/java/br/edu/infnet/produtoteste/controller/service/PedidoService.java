package br.edu.infnet.produtoteste.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.produtoteste.controller.repository.PedidoRepository;
import br.edu.infnet.produtoteste.controller.dto.PedidoDTO;

@Service
public class PedidoService {
	
	@Autowired		
		public PedidoRepository PedidoRepository;

		   public List<PedidoDTO> getAll() {
		        return (List<PedidoDTO>) PedidoRepository.findAll();
		    }
		   public PedidoDTO save(PedidoDTO pedido) {
			  return PedidoRepository.save(pedido);
		   }
	
}