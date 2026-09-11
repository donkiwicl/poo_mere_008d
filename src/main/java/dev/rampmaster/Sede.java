package dev.rampmaster;

import java.util.HashSet;

public class Sede {
    private Integer id;
    private String nombre;
    private String direccion;
    private HashSet<Piso> pisos;

    public Sede(Integer id, String nombre, String direccion, HashSet<Piso> pisos) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.pisos = pisos;
    }



    public void addPiso(Piso piso){
        this.pisos.add(piso);
        piso.setSede(this);
    }



    // Getter y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
