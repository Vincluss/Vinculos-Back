package com.example.api.service;

import com.example.api.model.Curso;
import com.example.api.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class CursoImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> getCurso(){
        return cursoRepository.findAll();
    }

    @Override
    public void delete(Integer id_curso) {
        cursoRepository.deleteById(id_curso);
    }

}
