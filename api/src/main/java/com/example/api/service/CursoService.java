package com.example.api.service;

import com.example.api.model.Curso;

import java.util.List;

public interface CursoService {

    public Curso saveCurso(Curso curso);
    public List<Curso> getCurso();
    void delete(Integer id_curso);

}
