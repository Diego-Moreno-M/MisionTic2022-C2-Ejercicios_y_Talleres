package com.diegomoreno.devjava.example;

// Abstracta: la ficha se puede mover pero no se como se mueve 
public abstract class Ficha {
    
    // Relaciones entre clases
    // Relación con Color
    public Color color;
    // Relación con casilla
    public Casilla origen;

    // Métodos
    public Boolean comer (){
        // TODO: Falta implementar este metodo
        return true;
    }

    public abstract Boolean mover(Casilla destino);
}
