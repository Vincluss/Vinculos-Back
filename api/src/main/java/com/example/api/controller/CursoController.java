package com.example.api.controller;

import com.example.api.model.Curso;
import com.example.api.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
@CrossOrigin
public class CursoController {

    @Autowired
    public CursoService cursoService;

    @GetMapping
    public List<Curso> list(){
        return cursoService.getCurso();
    }

    @PostMapping("/cadastrar_curso")
    public Curso insert(@RequestBody Curso curso){
        Curso result = cursoService.saveCurso(curso);
        return result;
    }

    @PutMapping("/atualizar_curso")
    public Curso update(@RequestBody Curso curso){
        Curso result = cursoService.saveCurso(curso);
        return result;
    }

    @DeleteMapping("/{id_curso}")
    public void delete(@PathVariable Integer id_curso){
        cursoService.delete(id_curso);
    }

}
