package dev.rampmaster;

import java.util.HashSet;

public class Sede{
    private int idSede;
    private String nombreSede;
    private String dirSede;
    private HashSet<Piso> pisos;

    public Sede(int idSede, String nombreSede, String dirSede) {
        this.idSede = idSede;
        this.nombreSede = nombreSede;
        this.dirSede = dirSede;
        this.pisos = new HashSet<>();
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDirSede() {
        return dirSede;
    }

    public void setDirSede(String dirSede) {
        this.dirSede = dirSede;
    }

    public HashSet<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(HashSet<Piso> pisos) {
        this.pisos = pisos;
    }

    public void mostrarSede(){
        System.out.println("Sede:");
        System.out.println("ID Sede: " + idSede);
        System.out.println("Nombre Sede: " + nombreSede);
        System.out.println("Dirección Sede: " + dirSede);
    }
}
