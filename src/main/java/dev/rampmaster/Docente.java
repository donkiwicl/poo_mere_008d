package dev.rampmaster;

public class Docente extends Usuario implements Colaborable{
    public Docente(String primNombre, String segNombre, String primApellido, String segApellido, int fechaNaci, String correoInst){
        super(primNombre, segNombre, primApellido, segApellido, fechaNaci, correoInst);
}

    public void usarJunaebColaborador(){
        System.out.println("Docente usa Junaeb");
    }

}
