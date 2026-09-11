package dev.rampmaster;

import java.util.HashSet;

public class Piso {
    private int idPiso;
    private int numPiso;
    private HashSet<Sala> salas;
    public Piso(int idPiso, int numPiso) {
        this.idPiso = idPiso;
        this.numPiso = numPiso;
        this.salas = new HashSet<>();
    }

    public int getIdPiso() {
        return idPiso;
    }

    public void setIdPiso(int idPiso) {
        this.idPiso = idPiso;
    }

    public int getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }

    public HashSet<Sala> getSalas() {
        return salas;
    }

    public void setSalas(HashSet<Sala> salas) {
        this.salas = salas;
    }

    public void mostrarPiso(){
        System.out.println("Piso:");
        System.out.println("ID Piso: " + idPiso);
        System.out.println("Número de piso: " + numPiso);
    }
}
