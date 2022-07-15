package com.diegomoreno.devjava.example.model;

// extends: la herencia, heredara los métodos y atributos de la clase padre
public class Reina extends Ficha {

    public Reina(Color color) {
        super(color);
    }

    // @Override: heredado de la clase padre
    @Override
    public Boolean mover(Casilla destino) {
        // TODO: Falta implementar este metodo como se mueve el reina
        return true;
    }

    @Override
    public String toString() {
        
        // Paso 1
        // return "T" + (super.color == Color.BLANCO ? "B" : "N");

        // Paso 2
        return "Q" + (getColor() == Color.BLANCO ? "B" : "N");
    }
    
}
