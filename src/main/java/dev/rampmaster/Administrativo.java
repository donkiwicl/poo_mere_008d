package dev.rampmaster;

public class Administrativo extends Usuario implements Colaborable {
    private String nombre;
    private String apellido;
    private String categoria;
    private String run;

    public Administrativo(String nombre, String run, String categoria, String apellido) {
        this.nombre = nombre;
        this.run = run;
        this.categoria = categoria;
        this.apellido = apellido;
    }
}
