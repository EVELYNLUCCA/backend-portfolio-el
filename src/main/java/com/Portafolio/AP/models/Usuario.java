

package com.Portafolio.AP.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable=false, updatable=false)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String acercaDeMi;
    private String fotoPerfil;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skills> skillList;
     
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;
    
    public Usuario(){
        
    }
    
    public Usuario(Long id, String nombre, String apellido, String titulo, 
     String acercaDeMi, String fotoPerfil){
     this.id = id;
     this.nombre = nombre;
     this.apellido = apellido;
     this.titulo = titulo;
     this.acercaDeMi = acercaDeMi;
     this.fotoPerfil = fotoPerfil;
     
     }
    
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getnombre(){
        return nombre;
    }
    public void setId(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String gettitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAcercaDeMi(){
        return acercaDeMi;
    }
    public void setAcercaDeMi(String acercaDeMi){
        this.acercaDeMi = acercaDeMi;
    }
    public String getFotoPerfil(){
        return fotoPerfil;
    }
    public void setFotoPerfil(String fotoPerfil){
        this.fotoPerfil = fotoPerfil;
    }
}
