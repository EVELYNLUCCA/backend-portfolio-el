

package com.Portafolio.AP.models;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;
    
    private String nombre;
    private String apellido;
    private String titulo;
    private String acercaDeMi;
    private String fotoPerfil;
    private String banner;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, String acercaDeMi, String fotoPerfil, String banner) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acercaDeMi = acercaDeMi;
        this.fotoPerfil = fotoPerfil;
        this.banner = banner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAcercaDeMi() {
        return acercaDeMi;
    }

    public void setAcercaDeMi(String acercaDeMi) {
        this.acercaDeMi = acercaDeMi;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }
    
    
}
