package dev.rampmaster;

public class Estudiante extends Usuario {
    private String nombre;
    private String apellido;
    private String categoria;
    private String run;
    public Estudiante(String nombre, String apellido, String categoria, String run) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

}
