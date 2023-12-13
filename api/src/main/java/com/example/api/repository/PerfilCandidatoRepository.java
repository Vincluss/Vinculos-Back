package com.example.api.repository;

import com.example.api.model.PerfilCandidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilCandidatoRepository extends JpaRepository<PerfilCandidato, Integer> {

}
