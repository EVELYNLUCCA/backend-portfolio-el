 
package com.Portafolio.AP.controller;

import com.Portafolio.AP.models.Proyecto;
import com.Portafolio.AP.services.IProyectoService;
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
@RequestMapping("/proyecto")
public class ProyectoController {
    @Autowired
	private IProyectoService proyectoService;
	
	@PostMapping("/nuevo/proyecto")
	public void agregarProyecto (@RequestBody Proyecto proyecto){
		proyectoService.crearProyecto(proyecto);
	}		

	@GetMapping("/ver/proyecto")
	@ResponseBody 
	public List<Proyecto> verProyecto (){
		return proyectoService.verProyecto();
	}
	
	@DeleteMapping("/borrar/{id}")
	public void eliminarProyecto (@PathVariable Long id) {
		proyectoService.eliminarProyecto(id);
	} 
	
	@PutMapping("/editar/{id}")
	public Proyecto editarProyecto(@PathVariable Long id,
                                @RequestParam("nombreProyecto") String nuevoNombreProyecto,
				@RequestParam("descripcion") String nuevaDescripcion,
				@RequestParam("url") String nuevaUrl,
				@RequestParam("fotoProyecto") String nuevaFotoProyecto){
        Proyecto proyecto = proyectoService.buscarProyecto(id);
        
	proyecto.setNombreProyecto(nuevoNombreProyecto);
	proyecto.setDescripcion(nuevaDescripcion);
	proyecto.setUrl(nuevaUrl);
	proyecto.setFotoProyecto(nuevaFotoProyecto);
		
        
	proyectoService.crearProyecto(proyecto);
        return proyecto;
}
}
