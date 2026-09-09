package dev.rampmaster;

public class Docente extends Usuario implements Colaborable{
    private String nombre;
    private String apellido;
    private String categoria;
    private String run;
    public Docente(String nombre, String apellido, String categoria, String run) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
