
package com.Portafolio.AP.repository;

import com.Portafolio.AP.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
    
}
