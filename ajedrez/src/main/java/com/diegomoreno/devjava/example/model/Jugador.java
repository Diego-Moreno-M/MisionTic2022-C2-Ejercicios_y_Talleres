package com.diegomoreno.devjava.example.model;

public class Jugador {
    
    // Relaciones entre clases
    // Relación con Color
    private Color color;

    // Atributos
    private String nombre;

    // Constructor: nombre de la función igual al nombre de la clase, no devuelve datos
    // le estamos diciendo que cuando quiera crear un jugador envié el nombre y color como parámetros
    public Jugador(String nombre, Color color){
        // this hace referencia al objeto, para indicarle que almacene nombre en el atributo de la clase nombre
        this.nombre = nombre;
        this.color = color;

    }
    
}
