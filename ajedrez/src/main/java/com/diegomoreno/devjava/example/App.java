package com.diegomoreno.devjava.example;

import com.diegomoreno.devjava.example.model.Tablero;

public class App 
{
    public static void main( String[] args ){
        // constructor: método especial de las clases para inicializar un objeto
        // new: crea un nuevo objeto en memoria de tipo Jugador
        // var diego = new Jugador("Diego Moreno", Color.BLANCO);
        // antes de crear el constructor en la clase Jugador, se tenia que hacer lo siguiente:
        // diego.nombre = "Diego Moreno";
        // diego.color = Color.BLANCO;

        // var brayan = new Jugador("Brayan Valencia", Color.NEGRO);
        // brayan.nombre = "Brayan Valencia";
        // brayan.color = Color.NEGRO;

        var tablero = new Tablero("Diego Moreno", "Brayan Valencia");
        // antes de crear el constructor en la clase Jugador, se tenia que hacer lo siguiente:
        // tablero.jugador1 = diego;
        // tablero.jugador2 = brayan;

        // Antes de hacer el constructor de la case Tablero se tenia que hacer esto
        // tablero.casillas = new Casilla[8][8];

        // Otra manera de hacerlo a continuación: 
        // tablero.casillas[0][0] = new Casilla();
        // tablero.casillas[0][0].color = Color.BLANCO;
        
        // var casilla = new Casilla();
        // casilla.color = Color.NEGRO;
        // tablero.casillas[0][0] = casilla;

        System.out.println(tablero);

        
    }
}
