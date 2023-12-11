package com.example.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_empresa;

    private String email_colaborador;
    private String nome_colaborador;
    private String empresa;
    private String cnpj;

    public Empresa(){

    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getEmail_colaborador() {
        return email_colaborador;
    }

    public void setEmail_colaborador(String email_colaborador) {
        this.email_colaborador = email_colaborador;
    }

    public String getNome_colaborador() {
        return nome_colaborador;
    }

    public void setNome_colaborador(String nome_colaborador) {
        this.nome_colaborador = nome_colaborador;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
