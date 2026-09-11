package dev.rampmaster;

public abstract class Usuario {
    protected String run;
    protected String primNombre;
    protected String segNombre;
    protected String primApellido;
    protected String segApellido;
    protected String fechaNaci;
    protected String correoInst;

    public Usuario(String run, String primNombre, String segNombre, String primApellido, String segApellido, String fechaNaci, String correoInst){
        this.run = run;
        this.primNombre = primNombre;
        this.segNombre = segNombre;
        this.primApellido = primApellido;
        this.segApellido = segApellido;
        this.fechaNaci = fechaNaci;
        this.correoInst = correoInst;
    }

    public abstract void mostrarDatos();




}
