package com.example.api.model;

import jakarta.persistence.*;

@Entity(name = "vagas")
@Table(name = "vagas")
public class Vagas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vagas;

    private float salario;
    private String titulo_vaga;
    private String localizacao;
    private String descricao_vaga;
    private String requisitos;
    private String sobre_empresa;

    public Vagas(){

    }

    public int getId_vagas() {
        return id_vagas;
    }

    public void setId_vagas(int id_vagas) {
        this.id_vagas = id_vagas;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTitulo_vaga() {
        return titulo_vaga;
    }

    public void setTitulo_vaga(String titulo_vaga) {
        this.titulo_vaga = titulo_vaga;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDescricao_vaga() {
        return descricao_vaga;
    }

    public void setDescricao_vaga(String descricao_vaga) {
        this.descricao_vaga = descricao_vaga;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getSobre_empresa() {
        return sobre_empresa;
    }

    public void setSobre_empresa(String sobre_empresa) {
        this.sobre_empresa = sobre_empresa;
    }
}
