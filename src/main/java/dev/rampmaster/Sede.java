package dev.rampmaster;

import java.util.HashSet;

public class Sede {

    private HashSet<Piso> pisos;
    private int cantPisos;

    public Sede(int cantPisos){
        this.cantPisos = cantPisos;
    }
    public int getCantPisos(){
        return this.cantPisos;
    }
    public void setCantPisos(int cantPisos){
        this.cantPisos = cantPisos;
    }
}
