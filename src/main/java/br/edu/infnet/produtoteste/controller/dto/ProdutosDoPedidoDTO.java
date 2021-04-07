package br.edu.infnet.produtoteste.controller.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProdutosDoPedidoDTO {
    
    @Id
    @GeneratedValue
    private Long id;
    private String product_type_code;
    private String supplier_code;

    public ProdutosDoPedidoDTO() {

    }

    public ProdutosDoPedidoDTO(String product_type_code, String supplier_code) {
        this.product_type_code = product_type_code;
        this.supplier_code = supplier_code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_type_code() {
        return product_type_code;
    }

    public void setProduct_type_code(String product_type_code) {
        this.product_type_code = product_type_code;
    }

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

}