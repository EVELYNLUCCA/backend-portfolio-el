
package com.Portafolio.AP.repository;

import com.Portafolio.AP.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProyectoRepo extends JpaRepository<Proyecto, Long> {
    
}
