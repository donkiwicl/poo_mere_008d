package dev.rampmaster;

import java.util.Date;
import java.util.HashSet;

public abstract class Usuario {
    //Principales
    private String rut;
    private String pri_nom;
    private String sec_nom;
    private String pri_ape;
    private String sec_ape;
    private Date fec_nac;
    private String correo;

    public Usuario(String rut, String pri_nom, String sec_nom, String pri_ape, String sec_ape, Date fec_nac, String correo) {
        this.rut = rut;
        this.pri_nom = pri_nom;
        this.sec_nom = sec_nom;
        this.pri_ape = pri_ape;
        this.sec_ape = sec_ape;
        this.fec_nac = fec_nac;
        this.correo = correo;
    }


    //Getters y Setters

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPri_nom() {
        return pri_nom;
    }

    public void setPri_nom(String pri_nom) {
        this.pri_nom = pri_nom;
    }

    public String getSec_nom() {
        return sec_nom;
    }

    public void setSec_nom(String sec_nom) {
        this.sec_nom = sec_nom;
    }

    public String getPri_ape() {
        return pri_ape;
    }

    public void setPri_ape(String pri_ape) {
        this.pri_ape = pri_ape;
    }

    public String getSec_ape() {
        return sec_ape;
    }

    public void setSec_ape(String sec_ape) {
        this.sec_ape = sec_ape;
    }

    public Date getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(Date fec_nac) {
        this.fec_nac = fec_nac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
