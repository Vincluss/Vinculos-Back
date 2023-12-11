package com.example.api.service;

import com.example.api.model.Vagas;

import java.util.List;

public interface VagasService {

    public Vagas saveVagas(Vagas vagas);
    public List<Vagas> getVagas();

    void delete(Integer id_vagas);
}
