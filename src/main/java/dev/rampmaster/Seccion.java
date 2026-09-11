package dev.rampmaster;

public class Seccion {
    private String  codigo;
    private Asignatura asignatura;
    private Docente docente;
    private String modalidad;
    private Sala sala;
    private boolean activo = false;

    public Seccion(String codigo, Asignatura asignatura, Docente docente, String modalidad, Sala sala, boolean activo) {
        this.codigo = codigo;
        this.asignatura = asignatura;
        this.docente = docente;
        this.modalidad = modalidad;
        this.sala = sala;
        this.activo = activo;
    }







    // Getter y Setters
    public String getCodigo() {
        return codigo;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
