package com.diegomoreno.devjava.example2.model;

public abstract class Persona implements Comparable<Persona> {

    /* ************************* Atributos ************************* */

    private String nombre;
    private Integer edad;

    /* ************************* Constructor ************************* */

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /* ************************* Métodos ************************* */

    public abstract void mostrar();

    @Override
    public int compareTo(Persona persona) {

        var comparado = getNombre().compareTo(persona.getNombre());
        if (comparado != 0) {
            return comparado;
        }

        comparado = getEdad().compareTo(persona.getEdad());
        return comparado;
    }

    /* ************************* Getters ************************* */
    // Métodos que me ayudan a obtener el valor de los atributos dentro de la clase

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }
}
