package com.example.api.service;

import com.example.api.model.PerfilCandidato;
import com.example.api.repository.PerfilCandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PerfilCandidatoImpl implements  PerfilCandidadoService {

    @Autowired
    private PerfilCandidatoRepository perfilCandidatoRepository;

    @Override
    public PerfilCandidato savePerfilCandidato(PerfilCandidato perfilCandidato){
        return perfilCandidatoRepository.save(perfilCandidato);
    }

    public List<PerfilCandidato> getPerfilCandidato(){
        return perfilCandidatoRepository.findAll();
    }

    public void delete(Integer id_perfilcandidato ){
        perfilCandidatoRepository.deleteById(id_perfilcandidato);
    }

}
