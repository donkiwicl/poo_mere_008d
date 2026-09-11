package dev.rampmaster;

public class Seccion {
    private String codigo;
    private String asignatura;
    private boolean activa = false;

    public Seccion(String codigo, String asignatura, boolean activa){
        this.codigo = codigo;
        this.asignatura = asignatura;
        this.activa = activa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public void mostrarSeccion(){
        System.out.println("Seccion: ");
        System.out.println("Codigo: " + codigo);
        System.out.println("Asignatura: "+ asignatura);
        System.out.println("Esta activa: "+ activa);
    }
}
