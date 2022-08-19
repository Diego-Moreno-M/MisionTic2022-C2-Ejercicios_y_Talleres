package com.diegomoreno.devjava.example.model;

public class Peon extends Ficha {

    public Peon(Color color) {
        // llama al constructor del padre
        super(color);
    }

    // Métodos
    public Boolean coronar(){
        return false;
    }

    public Boolean comerAlPaso(){
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public Boolean mover(Casilla destino) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean comer() {
        // TODO Auto-generated method stub
        // super: llama la clase ficha y ejecuta el método comer, llamada de métodos padre super.metodo()
        return super.comer();
    }
    // Super.comer: es llamar comer de la clase padre

    @Override
    public String toString() {
        
        // Paso 1
        // return "T" + (super.color == Color.BLANCO ? "B" : "N");

        // Paso 2
        return "P" + (getColor() == Color.BLANCO ? "B" : "N");
    }
    
}
