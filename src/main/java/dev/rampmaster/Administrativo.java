package dev.rampmaster;

public class Administrativo extends Usuario{
    private String cargo;


    public Administrativo(String nombre, String apellido, String correo, String run, String cargo) {
        super(nombre, apellido, correo, run);
        this.cargo = cargo;
    }




    //Getters and Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
