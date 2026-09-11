package dev.rampmaster;

import java.util.Date;
import java.util.HashSet;

public class Estudiante extends Usuario{
    //Compuestos
    private HashSet<Seccion> secciones;

    public Estudiante(String rut, String pri_nom, String sec_nom, String pri_ape, String sec_ape, Date fec_nac, String correo, HashSet<Seccion> secciones) {
        super(rut, pri_nom, sec_nom, pri_ape, sec_ape, fec_nac, correo);
        this.secciones = secciones;
    }

    public HashSet<Asignatura> getAsignaturas() {
        HashSet<Asignatura> asignaturas = new HashSet<>();
        for (Seccion seccion: secciones){
            asignaturas.add(seccion.getAsignatura());
        }
        return asignaturas;
    }


    //Getters y Setters
    public HashSet<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(HashSet<Seccion> secciones) {
        this.secciones = secciones;
    }
}
