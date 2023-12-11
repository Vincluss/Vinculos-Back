package com.example.api.service;

import com.example.api.model.Empresa;

import java.util.List;

public interface EmpresaService {

    public Empresa saveEmpresa(Empresa empresa);
    public List<Empresa> getEmpresa();
    void delete(Integer id_empresa);
}
