package dev.rampmaster;

public class Administrativo extends Usuario implements Colaborable{
    protected String field;

    public Administrativo(String nombre, String apellido, String correo, String run, String field ){
        super(nombre, apellido, correo, run);
        this.field = field;
    }

    public void usarJunaebColaborador(){
        System.out.println("Administrativo usa Junaeb");
    }
}
