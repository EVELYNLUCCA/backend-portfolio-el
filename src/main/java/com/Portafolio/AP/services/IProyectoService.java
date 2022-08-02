
package com.Portafolio.AP.services;

import com.Portafolio.AP.models.Proyecto;
import java.util.List;


public interface IProyectoService {
    public List <Proyecto> verProyecto ();
	
	public void crearProyecto (Proyecto proyecto);
	
	public void eliminarProyecto (Long id);
	
	public Proyecto buscarProyecto (Long id);
}
