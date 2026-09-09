package dev.rampmaster;

public abstract class Usuario {
    protected String primNombre;
    protected String segNombre;
    protected String primApellido;
    protected String segApellido;
    protected int fechaNaci;
    protected String correoInst;

    public Usuario(String primNombre, String segNombre, String primApellido, String segApellido, int fechaNaci, String correoInst){
        this.primNombre = primNombre;
        this.segNombre = segNombre;
        this.primApellido = primApellido;
        this.segApellido = segApellido;
        this.fechaNaci = fechaNaci;
        this.correoInst = correoInst;
    }




}
