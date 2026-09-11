package dev.rampmaster;

public class Sala {
    private int numSala;
    private int capMax;
    private int codSala;
    public Sala(int numSala, int capMax, int codSala){
        this.numSala = numSala;
        this.capMax = capMax;
        this.codSala = codSala;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCodSala() {
        return codSala;
    }

    public void setCodSala(int codSala) {
        this.codSala = codSala;
    }

    public void mostrarSala(){
        System.out.println("Sala:");
        System.out.println("Número de sala: " + numSala);
        System.out.println("Capacidad máxima: " + capMax);
        System.out.println("Código de sala: " + codSala);
    }
}
