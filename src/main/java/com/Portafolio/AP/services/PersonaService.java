
package com.Portafolio.AP.services;


import com.Portafolio.AP.models.Persona;
import com.Portafolio.AP.repository.PersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


  
@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepo personaRepo;
    
    @Override
    public void crearPersona(Persona persona) {
        personaRepo.save(persona);
    }

    @Override
    public List<Persona> verPersona() {
        return personaRepo.findAll();
    }

    @Override
    public Persona buscarPersona(Long id) {
         return personaRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarPersona(Long id) {
       personaRepo.deleteById(id);
    }
        
}
