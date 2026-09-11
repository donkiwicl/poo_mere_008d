package dev.rampmaster;

public class Docente extends Usuario implements Colaborable{
    public Docente(String run, String primNombre, String segNombre, String primApellido, String segApellido, String fechaNaci, String correoInst){
        super(run, primNombre, segNombre, primApellido, segApellido, fechaNaci, correoInst);
}

@Override
    public void usarJunaebColaborador(){
        System.out.println("Docente usa Junaeb");
    }

    public void mostrarDatos(){
        System.out.println("Rol: Docente");
        System.out.println("RUN: " + run);
        System.out.println("Nombre: " + primNombre + " " + segNombre + " " + primApellido + " " + segApellido);
        System.out.println("Fecha nacimiento: " + fechaNaci + " Correo Institucional: " + correoInst);
    }

}
