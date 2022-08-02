
package com.Portafolio.AP.services;

import com.Portafolio.AP.models.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List <Experiencia> verExperiencia ();
	
	public void crearExperiencia (Experiencia experiencia);
	
	public void eliminarExperiencia (Long id);
	
	public Experiencia buscarExperiencia (Long id);
}
