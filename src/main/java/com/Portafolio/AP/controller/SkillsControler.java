
package com.Portafolio.AP.controller;

import com.Portafolio.AP.models.Skills;
import com.Portafolio.AP.services.ISkillsService;
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
@RequestMapping("/skills")
public class SkillsControler {
    @Autowired
	private ISkillsService skillsService;
	
	@PostMapping("/nuevo/skill")
	public void agregarSkills (@RequestBody Skills skills){
		skillsService.crearSkills(skills);
	}		

	@GetMapping("/ver/skill")
	@ResponseBody 
	public List<Skills> verSkills (){
		return skillsService.verSkills();
	}
	
	@DeleteMapping("/borrar/{id}")
	public void eliminarSkills(@PathVariable Long id) {
		skillsService.eliminarSkills(id);
	} 
	
	@PutMapping("/editar/{id}")
    public Skills editarSkills(@PathVariable Long id,
                                @RequestParam("nombreSkill") String nuevoNombre,
				@RequestParam("fotoSkill") String nuevaFoto,
				@RequestParam("porcentaje") int nuevoPorcentaje){
        Skills skills = skillsService.buscarSkills(id);
        
        skills.setNombreSkill(nuevoNombre);
        skills.setImgSkill(nuevaFoto);
        skills.setPorcentajeSkill(nuevoPorcentaje);
        
       skillsService.crearSkills(skills);
        return skills;
    }
}
