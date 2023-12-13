package com.example.api.service;

import com.example.api.model.PerfilCandidato;

import java.util.List;

public interface PerfilCandidadoService {

    public PerfilCandidato savePerfilCandidato(PerfilCandidato perfilCandidato);
    public List<PerfilCandidato> getPerfilCandidato();
    void delete(Integer id_perfilCandidato);

}
