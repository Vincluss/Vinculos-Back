package com.example.api.service;

import com.example.api.model.Vagas;
import com.example.api.repository.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class VagasImpl implements VagasService{

    @Autowired
    private VagasRepository vagasRepository;

    @Override
    public Vagas saveVagas(Vagas vagas){
        return vagasRepository.save(vagas);
    }

    @Override
    public List<Vagas> getVagas() {
        return vagasRepository.findAll();
    }

    public void delete(Integer id_vagas){
        vagasRepository.deleteById(id_vagas);
    }

}
