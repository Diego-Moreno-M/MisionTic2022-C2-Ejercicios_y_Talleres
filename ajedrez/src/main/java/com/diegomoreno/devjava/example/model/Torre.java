package com.diegomoreno.devjava.example.model;

public class Torre extends Ficha {

    public Torre(Color color) {
        super(color);
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
        return "T" + (getColor() == Color.BLANCO ? "B" : "N");
    }
    
}
