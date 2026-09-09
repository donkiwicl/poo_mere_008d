package dev.rampmaster;

import java.util.HashSet;

public class Sede {
    private String nombre;
    private String direccion;
    private HashSet<Piso> pisos;

    public Sede(String nombre, String direccion, HashSet<Piso> pisos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pisos = pisos;
    }




    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HashSet<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(HashSet<Piso> pisos) {
        this.pisos = pisos;
    }
}
