package com.diegomoreno.devjava.example.model;

// extends: la herencia, heredara los métodos y atributos de la clase padre
public class Rey extends Ficha {

    public Rey(Color color) {
        super(color);
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO: Falta implementar este metodo como se mueve el rey
        return true;      
    }

    @Override
    public String toString() {
        
        // Paso 1
        // return "T" + (super.color == Color.BLANCO ? "B" : "N");

        // Paso 2
        return "R" + (getColor() == Color.BLANCO ? "B" : "N");
    }
    
}
