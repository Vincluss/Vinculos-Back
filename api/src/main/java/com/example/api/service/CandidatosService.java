package com.example.api.service;

import com.example.api.model.Candidato;

import java.util.List;

public interface CandidatosService {

   public Candidato saveCandidato(Candidato candidato);
   public List<Candidato> getCandidato();
   void delete(Integer id_candidato);

}
