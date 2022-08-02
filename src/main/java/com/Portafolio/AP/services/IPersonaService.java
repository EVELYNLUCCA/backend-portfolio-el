
package com.Portafolio.AP.services;

import com.Portafolio.AP.models.Persona;
import java.util.List;


public interface IPersonaService {
    
    public void crearPersona(Persona usuario);
    
    public List <Persona> verPersona(); 
    
    public Persona buscarPersona(Long id);
    
    public void borrarPersona(Long id);
}
