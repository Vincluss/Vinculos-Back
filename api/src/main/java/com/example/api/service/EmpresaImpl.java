package com.example.api.service;

import com.example.api.model.Empresa;
import com.example.api.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaImpl implements EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public Empresa saveEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public List<Empresa> getEmpresa(){
        return empresaRepository.findAll();
    }

    public void delete(Integer id_empresa){
        empresaRepository.deleteById(id_empresa);
    }

}
