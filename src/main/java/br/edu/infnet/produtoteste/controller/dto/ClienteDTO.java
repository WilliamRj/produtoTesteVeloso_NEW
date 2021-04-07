package br.edu.infnet.produtoteste.controller.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClienteDTO {

    @Id
    @GeneratedValue
    private Long id;
    private String fist_name;
    private String middle_name;
    private String last_name;

    public ClienteDTO() {

    }

    public ClienteDTO(String first_name, String middle_name, String last_name) {
        this.fist_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
    }

    public Long getid() {
        return id;
    }

    public void setCustomer_id(Long id) {
        this.id = id;
    }

    public String getFist_name() {
        return fist_name;
    }

    public void setFist_name(String fist_name) {
        this.fist_name = fist_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}