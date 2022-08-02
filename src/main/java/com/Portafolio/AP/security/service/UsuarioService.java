
package com.Portafolio.AP.security.service;

import com.Portafolio.AP.security.models.Usuario;
import com.Portafolio.AP.security.repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired 
    IUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String NombreUsuario){
        return iusuarioRepository.findByNombreUsuario(NombreUsuario);
    } 
    
    public boolean existByNombreUsuario(String NombreUsuario){
        return iusuarioRepository.existByNombreUsuario(NombreUsuario);
    }
    
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
    
}
