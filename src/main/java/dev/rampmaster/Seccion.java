package dev.rampmaster;

import java.util.HashSet;

public class Seccion {
    // Atributos
    private String codigo;
    private Asignatura asignatura;
    private boolean activa = false;
    HashSet<Seccion> secciones = new HashSet<Seccion>();

    public Seccion(String codigo, Asignatura asignatura){
        this.codigo = codigo;
        this.asignatura = asignatura;
    }

}
