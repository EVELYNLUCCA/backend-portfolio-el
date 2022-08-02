
package com.Portafolio.AP.controller;

import com.Portafolio.AP.models.Educacion;
import com.Portafolio.AP.services.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/educacion")
public class EducacionController {
    @Autowired
	private IEducacionService educacionService;
	
	@PostMapping("/nuevo/educacion")
	public void agregarEducacion (@RequestBody Educacion educacion){
		educacionService.crearEducacion(educacion);
	}		

	@GetMapping("/ver/educacion")
	@ResponseBody 
	public List<Educacion> verEducacion (){
		return educacionService.verEducacion();
	}
	
	@DeleteMapping("/borrar/{id}")
	public void eliminarUsuario (@PathVariable Long id) {
		educacionService.eliminarEducacion(id);	
	}
	
	@PutMapping("/editar/{id}")
	public Educacion editarEducacion(@PathVariable Long id,
                                @RequestParam("institucion") String nuevaInstitucion,
				@RequestParam("titulo") String nuevoTitulo,
				@RequestParam("anoInicio") int nuevoAnoInicio,
				@RequestParam("anoFin") int nuevoAnoFin){
        Educacion educacion = educacionService.buscarEducacion(id);
        
        educacion.setInstitucionEdu(nuevaInstitucion);
        educacion.setTituloEdu(nuevoTitulo);
        educacion.setAnoInicioEdu(nuevoAnoInicio);
	educacion.setAnoFinEdu(nuevoAnoFin);
        
       educacionService.crearEducacion(educacion);
        return educacion;
}
}