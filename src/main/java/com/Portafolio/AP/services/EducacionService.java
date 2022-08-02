
package com.Portafolio.AP.services;

import com.Portafolio.AP.models.Educacion;
import com.Portafolio.AP.repository.EducacionRepo;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo  educacionRepo;
    
    @Autowired
    public EducacionService(EducacionRepo educacionRepo){
        this.educacionRepo = educacionRepo;
    }
    
    public Educacion addEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public List<Educacion> buscarEucaciones(){
        return educacionRepo.findAll();
    }
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion); 
    }
    public void borrarEducacion(Long id){
         educacionRepo.deleteById(id);
    }  
    
}
