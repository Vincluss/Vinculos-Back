package com.example.api.controller;

import com.example.api.model.Empresa;
import com.example.api.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
@CrossOrigin
public class EmpresaController {

    @Autowired
    public EmpresaService empresaService;

    @GetMapping
    public List<Empresa> list(){
        return empresaService.getEmpresa();
    }

    @PostMapping("cadastrar_empresa")
    public Empresa insert(@RequestBody Empresa empresa){
        Empresa result = empresaService.saveEmpresa(empresa);
        return result;
    }

    @DeleteMapping("/{id_empresa}")
    public void delete(@PathVariable Integer id_empresa){
        empresaService.delete(id_empresa);
    }

}
