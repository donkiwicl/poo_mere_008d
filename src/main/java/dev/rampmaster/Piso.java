package dev.rampmaster;

import java.util.HashSet;

public class Piso {
    private Integer id;
    private int numero;
    private HashSet<Sala> salas;
    private Sede sede;


    public Piso(Integer id, int numero, HashSet<Sala> salas, Sede sede) {
        this.id = id;
        this.numero = numero;
        this.salas = salas;
        this.sede = sede;
    }



    public void addSala(Sala sala){
        this.salas.add(sala);
        sala.setPiso(this);
    }



    //Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
}
