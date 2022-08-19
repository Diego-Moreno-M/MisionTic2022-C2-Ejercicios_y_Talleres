package com.diegomoreno.devjava.example.model;

public class Casilla {
    
    // Relaciones entre clases
    // Relación con Color
    private Color color;
    // Relación con Ficha
    private Ficha ficha;

    // Atributos
    private Integer fila;
    private Character columna;

    // Constructor 
    public Casilla (Integer fila, Character columna, Color color){
        this.fila = fila;
        this.columna = columna;
        this.color = color;
    }
    
    // Métodos

    // Método setter: su única función es asignar valores a atributos de clase
    public void setFicha(Ficha ficha){
        this.ficha = ficha;
    }

    public Boolean estaOcupada (){
        // TODO: Falta implementar este metodo
        if (ficha != null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        // si esta ocupada imprima ficha si no un espacio en blanco
        return estaOcupada() ? ficha.toString() : " ";
    }
}
