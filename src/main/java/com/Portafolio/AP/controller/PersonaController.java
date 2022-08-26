package com.Portafolio.AP.controller;

import com.Portafolio.AP.models.Persona;
import com.Portafolio.AP.services.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private IPersonaService personaService;
    
    @GetMapping("/ver/persona")
    @ResponseBody
    public List <Persona> getPersona(){
        return personaService.verPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/nuevo/persona")
	public void crearPersona(@RequestBody Persona persona){
            personaService.crearPersona(persona);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void eliminarPersona(@PathVariable Long id){
        personaService.borrarPersona(id);
    } 
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Persona editarPersona(@PathVariable Long id,
            @RequestParam("nombre")String nuevoNombre,
            @RequestParam("apellido")String nuevoApellido,
            @RequestParam("titulo")String nuevoTitulo,
            @RequestParam("acercaDeMi")String nuevoAcercaDeMi,
            @RequestParam("fotoPerfil")String nuevaFotoPerfil,
            @RequestParam("banner")String nuevoBanner){
        Persona persona = personaService.buscarPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setTitulo(nuevoTitulo);
        persona.setAcercaDeMi(nuevoAcercaDeMi);
        persona.setFotoPerfil(nuevaFotoPerfil);
        persona.setBanner(nuevoBanner);
        
        personaService.crearPersona(persona);
        return persona;
    }      
}
