package com.diegomoreno.devjava.example;

public class Casilla {
    
    // Relaciones entre clases
    // Relación con Color
    public Color color;
    // Relación con Ficha
    public Ficha ficha;

    // Atributos
    public Integer fila;
    public Character columna;
    
    // Métodos
    public Boolean estaOcupada (){
        // TODO: Falta implementar este metodo
        if (ficha != null){
            return true;
        }
        return false;
    }
}
