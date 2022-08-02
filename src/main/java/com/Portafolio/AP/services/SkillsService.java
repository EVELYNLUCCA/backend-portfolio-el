
package com.Portafolio.AP.services;

import com.Portafolio.AP.models.Skills;
import com.Portafolio.AP.repository.SkillsRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SkillsService implements ISkillsService{
    @Autowired
	public SkillsRepo skillsRepo;

	@Override
	public List<Skills> verSkills() {
		return skillsRepo.findAll();	
	}

	@Override
	public void crearSkills(Skills skills) {
		skillsRepo.save(skills);
	}

	@Override
	public void eliminarSkills(Long id) {
		skillsRepo.deleteById(id);	
	}

	@Override
	public Skills buscarSkills(Long id) {
		return skillsRepo.findById(id).orElse(null);
	}
 }
