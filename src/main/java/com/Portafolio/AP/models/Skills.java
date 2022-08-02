
package com.Portafolio.AP.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String nombreSkill;
    private String imgSkill;
    private int porcentajeSkill;
    
    public Skills(){
        
    }
    public Skills(Long idSkill, String nombreSkill, String imgSkill,int porcentajeSkill){
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.imgSkill = imgSkill;
        this.porcentajeSkill = porcentajeSkill;
        
     }   
    
    public Long getIdSkill(){
        return idSkill;
    }
    public void setIdSkill(Long idSkill){
        this.idSkill = idSkill;
    }
    public String getNombreSkill(){
        return nombreSkill;
    }
    public void setNombreSkill(String nombreSkill){
        this.nombreSkill = nombreSkill;
    }
    public String getImgSkill(){
        return imgSkill;
    }
    public void setImgSkill(String imgSkill){
        this.imgSkill = imgSkill;
    }
    public int getPorcentajeSkill(){
        return porcentajeSkill;
    }
    public void setPorcentajeSkill(int porcentajeSkill){
        this.porcentajeSkill = porcentajeSkill;
    }
}


