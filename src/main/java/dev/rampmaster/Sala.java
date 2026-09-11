package dev.rampmaster;

public class Sala {
    private Integer id;
    private String code;
    private Piso piso;
    private int capacidad;
    //Necesito crear aca secciones???

    public Sala(Integer id, String code, Piso piso, int capacidad) {
        this.id = id;
        this.code = code;
        this.piso = piso;
        this.capacidad = capacidad;
    }




    //Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Piso getPiso() {
        return piso;
    }

    public void setPiso(Piso piso) {
        this.piso = piso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
