package dev.rampmaster;

public class Administrativo extends Usuario implements Colaborable{
    public Administrativo(String run, String primNombre, String segNombre, String primApellido, String segApellido, String fechaNaci, String correoInst){
        super(run, primNombre, segNombre, primApellido, segApellido, fechaNaci, correoInst);
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Rol: Administrativo");
        System.out.println("RUN: " + run);
        System.out.println("Nombre: " + primNombre + " " + segNombre + " " + primApellido + " " + segApellido);
        System.out.println("Fecha nacimiento: " + fechaNaci + " Correo Institucional: " + correoInst);
    }

    @Override
    public void usarJunaebColaborador(){
        System.out.println("Administrativo usa Junaeb");
    }
}