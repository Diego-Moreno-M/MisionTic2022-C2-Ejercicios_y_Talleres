package com.diegomoreno.devjava.example.model;

public class Alfil extends Ficha {

    // Constructor
    public Alfil(Color color) {
        // super: llama al constructor de la clase padre
        super(color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        
        // Paso 1
        // return "T" + (super.color == Color.BLANCO ? "B" : "N");

        // Paso 2
        return "A" + (getColor() == Color.BLANCO ? "B" : "N");
    }
    
}
