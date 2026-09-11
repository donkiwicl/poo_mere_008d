package dev.rampmaster;

import java.util.HashSet;

public class Asignatura {
            private Integer id;
            private String nombre;
            private String code;
            private HashSet<Seccion> secciones;
            //No pondre Jornada aca. Eso debe pertenercer a la seccion.


    public Asignatura(Integer id, String nombre, String code, HashSet<Seccion> secciones) {
        this.id = id;
        this.nombre = nombre;
        this.code = code;
        this.secciones = secciones;
    }



    public void addSection (Seccion seccion){
        this.secciones.add(seccion);
        seccion.setAsignatura(this);
    }


    //Getter y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public HashSet<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(HashSet<Seccion> secciones) {
        this.secciones = secciones;
    }
}
