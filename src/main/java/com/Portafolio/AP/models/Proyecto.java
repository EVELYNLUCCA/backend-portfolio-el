
package com.Portafolio.AP.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
        private Long idProy;
	private String nombreProyecto;
	private String descripcion;
	private String url;
	private String fotoProyecto;

    public Proyecto() {
    }

    public Proyecto(Long idProy, String nombreProyecto, String descripcion, String url, String fotoProyecto) {
        this.idProy = idProy;
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.url = url;
        this.fotoProyecto = fotoProyecto;
    }

    public Long getIdProy() {
        return idProy;
    }

    public void setIdProy(Long idProy) {
        this.idProy = idProy;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFotoProyecto() {
        return fotoProyecto;
    }

    public void setFotoProyecto(String fotoProyecto) {
        this.fotoProyecto = fotoProyecto;
    }
}
