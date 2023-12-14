package com.example.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cadastro_candidato")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id_candidato")
    private int id_candidato;

    //@Column(name = "cpf_candidato")
    private String cpf_candidato;

    private String nome_candidato;

    //@Column(name = "email_candidato")
    private String email_candidato;

    private String senha_candidato;
/*
    @OneToOne(mappedBy = "candidato", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private PerfilCandidato perfilCandidato;
*/
    public Candidato(){

    }

    public int getId_candidato() {
        return id_candidato;
    }

    public void setId_candidato(int id_candidato) {
        this.id_candidato = id_candidato;
    }

    public String getCpf_candidato() {
        return cpf_candidato;
    }

    public void setCpf_candidato(String cpf_candidato) {
        this.cpf_candidato = cpf_candidato;
    }

    public String getNome_candidato() {
        return nome_candidato;
    }

    public void setNome_candidato(String nome_candidato) {
        this.nome_candidato = nome_candidato;
    }

    public String getEmail_candidato() {
        return email_candidato;
    }

    public void setEmail_candidato(String email_candidato) {
        this.email_candidato = email_candidato;
    }

    public String getSenha_candidato() {
        return senha_candidato;
    }

    public void setSenha_candidato(String senha_candidato) {
        this.senha_candidato = senha_candidato;
    }

    /*  public PerfilCandidato getPerfilCandidato() {
        return perfilCandidato;
    }

    public void setPerfilCandidato(PerfilCandidato perfilCandidato) {
        this.perfilCandidato = perfilCandidato;
    }
*/
}
