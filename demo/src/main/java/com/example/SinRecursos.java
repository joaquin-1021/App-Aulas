package com.example;

public class SinRecursos extends Aula {
    private boolean Ventiladores;
    private String descripcion;
    public boolean isVentiladores() {
        return Ventiladores;
    }
    
    public void setVentiladores(boolean ventiladores) {
        Ventiladores = ventiladores;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
