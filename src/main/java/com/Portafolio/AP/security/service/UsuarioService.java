
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
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    } 
    
    public boolean existByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existByNombreUsuario(nombreUsuario);
    }
    
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }

    public boolean existsByNuevoUsuario(String nombreUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
