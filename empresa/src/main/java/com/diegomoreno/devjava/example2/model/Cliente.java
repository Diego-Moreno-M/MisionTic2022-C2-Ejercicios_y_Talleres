package com.diegomoreno.devjava.example2.model;

public class Cliente extends Persona {
    
    /* ************************* Atributos ************************* */
    
    private String telefono;

    /* ************************* Constructor ************************* */

    public Cliente(String nombre, Integer edad) {
        this(nombre, edad, "No asignado");
    }

    public Cliente(String nombre, Integer edad, String telefono) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    /* ************************* Métodos ************************* */
    // @Override: anotación, este método es una sobre escritura del método del padre

    @Override
    public void mostrar() {
        System.out.printf(
            "El empleado de nombre %s tiene %d años y su teléfono es %s %n",
            getNombre(), getEdad(), telefono);
        
    }

    /* ************************* Getters y Setters ************************* */

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }  

    
}
