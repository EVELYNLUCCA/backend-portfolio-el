
package com.Portafolio.AP.controller.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank 
    private String institucionEdu;
    @NotBlank 
    private String tituloEdu;
    @NotBlank 
    private int anoInicioEdu;
    @NotBlank 
    private int anoFinEdu;
    
    //constructor

    public dtoEducacion() {
    }

    public dtoEducacion(String institucionEdu, String tituloEdu, int anoInicioEdu, int anoFinEdu) {
        this.institucionEdu = institucionEdu;
        this.tituloEdu = tituloEdu;
        this.anoInicioEdu = anoInicioEdu;
        this.anoFinEdu = anoFinEdu;
    }
    
    //getter y setter

    public String getInstitucionEdu() {
        return institucionEdu;
    }

    public void setInstitucionEdu(String institucionEdu) {
        this.institucionEdu = institucionEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public int getAnoInicioEdu() {
        return anoInicioEdu;
    }

    public void setAnoInicioEdu(int anoInicioEdu) {
        this.anoInicioEdu = anoInicioEdu;
    }

    public int getAnoFinEdu() {
        return anoFinEdu;
    }

    public void setAnoFinEdu(int anoFinEdu) {
        this.anoFinEdu = anoFinEdu;
    }
}
