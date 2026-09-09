package dev.rampmaster;

import java.util.HashSet;

public class Piso {
    private int numero;
    private HashSet<Sala> salas;

    public Piso(int numero, HashSet<Sala> salas) {
        this.numero = numero;
        this.salas = salas;
    }






    // getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public HashSet<Sala> getSalas() {
        return salas;
    }

    public void setSalas(HashSet<Sala> salas) {
        this.salas = salas;
    }
}
