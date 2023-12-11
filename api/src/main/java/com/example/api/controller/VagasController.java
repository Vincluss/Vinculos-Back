package com.example.api.controller;

import com.example.api.model.Vagas;
import com.example.api.service.VagasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vagas")
@CrossOrigin
public class VagasController {

    @Autowired
    public VagasService vagasService;

    @GetMapping
    public List<Vagas> list(){
        return vagasService.getVagas();
    }

    @PostMapping("cadastrar_vaga")
    public Vagas insert(@RequestBody Vagas vagas){
        Vagas result = vagasService.saveVagas(vagas);
        return result;
    }

    @PutMapping("atualizar")
    public Vagas update(@RequestBody Vagas vagas){
        Vagas result = vagasService.saveVagas(vagas);
        return result;
    }

    @DeleteMapping("/{id_vagas}")
    public void delete(@PathVariable Integer id_vagas){
        vagasService.delete(id_vagas);
    }

}
