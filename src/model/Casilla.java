package model;

import java.io.Serializable;

public class Casilla implements Serializable{

    public static final String OCUPADO = "Ocupado";
    public static final String DESOCUPADO = "Desocupado";

    private String estado;
    private Carpa carpa;


    public Casilla() {
        this.estado = DESOCUPADO;
        this.carpa = null;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Carpa getCarpa() {
        return carpa;
    }

    public void setCarpa(Carpa carpa) {
        this.carpa = carpa;
    }
    
    
}
