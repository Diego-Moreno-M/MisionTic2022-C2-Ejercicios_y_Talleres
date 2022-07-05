package com.diegomoreno.devjava.example;

public class Peon extends Ficha {

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
        return super.comer();
    }
    
}
