package com.example.api.service;

import com.example.api.model.Candidato;
import com.example.api.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatosImpl implements CandidatosService{

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Override
    public Candidato saveCandidato(Candidato candidato){
        return candidatoRepository.save(candidato);
    };

    @Override
    public List<Candidato> getCandidato(){
        return candidatoRepository.findAll();
    }

    public void delete(Integer id_candidato){
        candidatoRepository.deleteById(id_candidato);
    }

}
