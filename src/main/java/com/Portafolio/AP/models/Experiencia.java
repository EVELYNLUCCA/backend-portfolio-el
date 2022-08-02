
package com.Portafolio.AP.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String institucionExp;
    private String tituloExp;  
    private int anoInicioExp;
    private int anoFinExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String institucionExp, String tituloExp, int anoInicioExp, int anoFinExp) {
        this.idExp = idExp;
        this.institucionExp = institucionExp;
        this.tituloExp = tituloExp;
        this.anoInicioExp = anoInicioExp;
        this.anoFinExp = anoFinExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getInstitucionExp() {
        return institucionExp;
    }

    public void setInstitucionExp(String institucionExp) {
        this.institucionExp = institucionExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public int getAnoInicioExp() {
        return anoInicioExp;
    }

    public void setAnoInicioExp(int anoInicioExp) {
        this.anoInicioExp = anoInicioExp;
    }

    public int getAnoFinExp() {
        return anoFinExp;
    }

    public void setAnoFinExp(int anoFinExp) {
        this.anoFinExp = anoFinExp;
    }
    
}
  
        
    
