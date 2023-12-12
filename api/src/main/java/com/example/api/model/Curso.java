package com.example.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_curso;

    private String nome_curso;
    private int avaliacao_curso;
    private String comentario;

    public Curso(){

    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public int getAvaliacao_curso() {
        return avaliacao_curso;
    }

    public void setAvaliacao_curso(int avaliacao_curso) {
        this.avaliacao_curso = avaliacao_curso;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
