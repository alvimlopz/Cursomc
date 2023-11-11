package com.alvimcode.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alvimcode.cursomc.domain.Estado;

@Repository
public interface CidadeRepository extends JpaRepository<Estado, Integer>{

}