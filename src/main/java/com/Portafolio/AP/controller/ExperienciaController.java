 
package com.Portafolio.AP.controller;

import com.Portafolio.AP.models.Experiencia;
import com.Portafolio.AP.services.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/experiencia")
public class ExperienciaController {
    @Autowired
	private IExperienciaService experienciaService;
	
	@PostMapping("/nuevo/experiencia")
	public void agregarExperiencia (@RequestBody Experiencia experiencia){
		experienciaService.crearExperiencia(experiencia);
	}		

	@GetMapping("/ver/experiencia")
	@ResponseBody 
	public List<Experiencia> verExperiencia (){
		return experienciaService.verExperiencia();
	}
	
	@DeleteMapping("/borrar/{id}")
	public void eliminarExperiencia (@PathVariable Long id) {
		experienciaService.eliminarExperiencia(id);
	} 
	
	@PutMapping("/editar/{id}")
	public Experiencia editarExperiencia(@PathVariable Long id,
                                @RequestParam("empresa") String nuevaEmpresa,
                                @RequestParam("anoInicio") int nuevoAnoInicio,
				@RequestParam("anoFin") int nuevoAnoFin,
                                @RequestParam("descripcion") String nuevaDescripcion){
            
        Experiencia experiencia = experienciaService.buscarExperiencia(id);
        
        experiencia.setEmpresa(nuevaEmpresa);
        experiencia.setAnoInicio(nuevoAnoInicio);
	experiencia.setAnoFin(nuevoAnoFin);
        experiencia.setDescripcion(nuevaDescripcion);
	
        
       experienciaService.crearExperiencia(experiencia);
        return experiencia;
}
}
