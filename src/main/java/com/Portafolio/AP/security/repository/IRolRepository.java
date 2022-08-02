
package com.Portafolio.AP.security.repository;

import com.Portafolio.AP.security.enums.RolNombre;
import com.Portafolio.AP.security.models.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
