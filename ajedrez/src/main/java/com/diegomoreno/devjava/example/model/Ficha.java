package com.diegomoreno.devjava.example.model;

// Abstracta: la ficha se puede mover pero no se como se mueve 
public abstract class Ficha {

    /*
     * ********************** Relaciones entre clases
     * Relación con Color. Protected va a ser privada para las clases que no estén
     * heredando de ella
     * y va a ser publica para las que si. Esta es una manera, si no se quiere asi
     * se puede dejar
     * privada y se hace el paso 2 en vez del paso 1.
     */

    // Paso 1
    // protected Color color;

    // Paso 2
    private Color color;

    // Relación con casilla
    private Casilla origen;
    // **********************************************************************************************

    // ! *************************** Constructor
    // Constructor
    // De igual manera puede inicializarse solo con el parámetro color
    public Ficha(Color color) {
        this(color, null);
    }
    
    public Ficha(Color color, Casilla origen) {
        this.color = color;
        this.origen = origen;
    }
    // **********************************************************************************************

    // ! ************************** Métodos
    public Boolean comer() {
        // TODO: Falta implementar este metodo
        return true;
    }

    public abstract Boolean mover(Casilla destino);
    // **********************************************************************************************

    // ! ********************************* Getter
    // Getter: Métodos que me devuelven el valor de un atributo dentro de una clase.
    // Paso 2
    public Color getColor() {
        return color;
    }

    public Casilla getOrigen() {
        return origen;
    }
    // **********************************************************************************************
}
