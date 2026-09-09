package dev.rampmaster;
//identificador interno, un nombre, un código, una
//sección y una jornada

public class Asignatura {
    private String id;
    private String nombre;
    private String codigo;
    private String seccion;
    private String jornada;

    public Asignatura(String id, String nombre, String codigo, String seccion, String jornada) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.seccion = seccion;
        this.jornada = jornada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
}
