package br.edu.infnet.produtoteste.controller.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class PedidoDTO {
	@Id
	@GeneratedValue
	private Long id;
	private Long costumer_id;
	private String status;	
	@ManyToOne(optional=true, fetch=FetchType.LAZY)
	@JoinColumn(name="costumer_id", referencedColumnName="id", insertable=false, updatable=false)
	private ClienteDTO users;


	public PedidoDTO() {

	}

	public PedidoDTO(String status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public Long getCostumer_id() {
		return costumer_id;
	}

	public String getStatus() {
		return status;
	}

	public ClienteDTO getUsers() {
		return users;
	}

}