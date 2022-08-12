 
package com.Portafolio.AP.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEdu;
    private String institucionEdu;
    private String tituloEdu;
    private int anoInicioEdu;
    private int anoFinEdu;

    public Educacion() {
        
    }

    public Educacion(Long idEdu, String institucionEdu, String tituloEdu, int anoInicioEdu, int anoFinEdu) {
        this.idEdu = idEdu;
        this.institucionEdu = institucionEdu;
        this.tituloEdu = tituloEdu;
        this.anoInicioEdu = anoInicioEdu;
        this.anoFinEdu = anoFinEdu;
    }

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

