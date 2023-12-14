package com.example.api.controller;

import com.example.api.model.PerfilCandidato;
import com.example.api.service.PerfilCandidadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfil")
@CrossOrigin
public class PerfilCandidatoController {

    @Autowired
    public PerfilCandidadoService perfilCandidadoService;

    @GetMapping
    public List<PerfilCandidato> list(){
        return perfilCandidadoService.getPerfilCandidato();
    }

    @PostMapping("cadastrar_perfil")
    public PerfilCandidato insert(@RequestBody PerfilCandidato perfilCandidato){
        PerfilCandidato result = perfilCandidadoService.savePerfilCandidato(perfilCandidato);
        return result;
    }

    @PutMapping("atualizar_perfil")
    public PerfilCandidato update(@RequestBody PerfilCandidato perfilCandidato){
        PerfilCandidato result = perfilCandidadoService.savePerfilCandidato(perfilCandidato);
        return result;
    }

    @DeleteMapping("/{id_perfilcandidato}")
    public void delete(@PathVariable Integer id_perfilcandidato){
        perfilCandidadoService.delete(id_perfilcandidato);
    }

}
