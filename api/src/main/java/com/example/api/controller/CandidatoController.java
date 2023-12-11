package com.example.api.controller;

import com.example.api.model.Candidato;
import com.example.api.service.CandidatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidato")
@CrossOrigin
public class CandidatoController {

    @Autowired
    public CandidatosService candidatosService;

    @GetMapping
    public List<Candidato> list(){
        return candidatosService.getCandidato();
    }

    @PostMapping("cadastrar_candidato")
    public Candidato insert(@RequestBody Candidato candidato){
        Candidato result = candidatosService.saveCandidato(candidato);
        return  result;
    }

    @DeleteMapping("/{id_candidato}")
    public void delete(@PathVariable Integer id_candidato){
        candidatosService.delete(id_candidato);
    }

}
