
package com.Portafolio.AP.controller.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String institucionExp;
    @NotBlank
    private String tituloExp;
    @NotBlank
    private String anoInicioExp;
    @NotBlank
    private String anoFinExp;
    
    //constructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String institucionExp, String tituloExp, String anoInicioExp, String anoFinExp) {
        this.institucionExp = institucionExp;
        this.tituloExp = tituloExp;
        this.anoInicioExp = anoInicioExp;
        this.anoFinExp = anoFinExp;
    }
    
    //getter y setter

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

    public String getAnoInicioExp() {
        return anoInicioExp;
    }

    public void setAnoInicioExp(String anoInicioExp) {
        this.anoInicioExp = anoInicioExp;
    }

    public String getAnoFinExp() {
        return anoFinExp;
    }

    public void setAnoFinExp(String anoFinExp) {
        this.anoFinExp = anoFinExp;
    }
    
}
