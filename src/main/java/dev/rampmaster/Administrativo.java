package dev.rampmaster;

import java.util.Date;

public class Administrativo extends Usuario implements Colaborable {
    private String cargo;

    public Administrativo(String rut, String pri_nom, String sec_nom, String pri_ape, String sec_ape, Date fec_nac, String correo, String cargo) {
        super(rut, pri_nom, sec_nom, pri_ape, sec_ape, fec_nac, correo);
        this.cargo = cargo;
    }

    @Override
    public void usarJunaColaborador(int descuento) {
        double totalCompra = descuento - descuento*0.5;
        System.out.println("El valor total de la compra es de:" + totalCompra );
    }



    //Getters y Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
