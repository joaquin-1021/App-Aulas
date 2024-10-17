package com.example;

public class Dia_Reserva_Esporadica {
   private Integer id_dia;
   private LocalDate fecha;
   private LocalDate hora_inicio;
   private Integer duracion;
    
    public Integer getId_dia() {
        return id_dia;
    }
    public void setId_dia(Integer id_dia) {
        this.id_dia = id_dia;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalDate getHora_inicio() {
        return hora_inicio;
    }
    public void setHora_inicio(LocalDate hora_inicio) {
        this.hora_inicio = hora_inicio;
    }
    public Integer getDuracion() {
        return duracion;
    }
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    
}
