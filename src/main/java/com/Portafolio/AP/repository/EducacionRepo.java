
package com.Portafolio.AP.repository;

import com.Portafolio.AP.models.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EducacionRepo extends JpaRepository<Educacion, Long>{
    
}
