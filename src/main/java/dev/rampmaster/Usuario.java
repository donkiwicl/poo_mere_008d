package dev.rampmaster;

public abstract class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String run;

    public Usuario(String nombre, String apellido, String correo, String run) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.run = run;
    }









    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }
}
