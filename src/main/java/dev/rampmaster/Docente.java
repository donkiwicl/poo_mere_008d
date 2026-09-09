package dev.rampmaster;

import java.util.HashMap;
import java.util.HashSet;

public class Docente extends Usuario {
    private HashMap<Asignatura, Seccion> clases;

    public Docente(String nombre, String apellido, String correo, String run, HashMap<Asignatura, Seccion> clases) {
        super(nombre, apellido, correo, run);
        this.clases = clases;
    }





    // getters y setters
    public HashMap<Asignatura, Seccion> getClases() {
        return clases;
    }

    public void setClases(HashMap<Asignatura, Seccion> clases) {
        this.clases = clases;
    }
}
