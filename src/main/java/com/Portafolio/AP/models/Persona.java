

package com.Portafolio.AP.models;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;
    
    private String nombre;
    private String apellido;
    private String titulo;
    private String acercaDeMi;
    private String fotoPerfil;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, String acercaDeMi, String fotoPerfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acercaDeMi = acercaDeMi;
        this.fotoPerfil = fotoPerfil;
    }   
}
