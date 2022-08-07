
package com.Portafolio.AP.repository;

import com.Portafolio.AP.models.Experiencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia, Long>{
   
  }
