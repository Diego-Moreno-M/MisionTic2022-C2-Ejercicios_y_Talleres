package com.diegomoreno.devjava.example2.model;

public class Empleado extends Persona {

    /* ************************* Constantes ************************* */
    // protected: la clase y herederos van a poder usar esta constante
    protected static final Double SUELDO_POR_DEFECTO = 1_000_000d;
    
    /* ************************* Atributos ************************* */

    private Double sueldoBruto;

    /* ************************* Constructor ************************* */
    
    // Si se registra como empleado pero aun no registran sueldo
    // Constructor 1
    public Empleado(String nombre, Integer edad) {
        
        // Reutilizar constructor 2
        this(nombre, edad, SUELDO_POR_DEFECTO);
        
        /* Otra manera de hacerlo
        super(nombre, edad);
        this.sueldoBruto = 0d; // 0d: numero en double */
    }

    // Constructor 2 Principal
    public Empleado(String nombre, Integer edad, Double sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    /* ************************* Métodos ************************* */
    // @Override: anotación, este método es una sobre escritura del método del padre
    @Override
    public void mostrar() {
        System.out.printf(
            "El empleado de nombre %s tiene %d años y un sueldo de $ %,.2f %n",
            getNombre(), getEdad(), sueldoBruto);
        
    }

    public Double calcularValorNeto(){
        var porcentajeSalud = 4d;
        var porcentajePension = 4d;

        return getSueldoBruto() * (100 - porcentajeSalud - porcentajePension / 100);

    }

    // @Override
    // public int compareTo(Object o) {
    //     if (!(o instanceof Empleado)){
    //         return -1;
    //     }
    //     var emp = (Empleado) o;

    //     var comparado = getNombre().compareTo(emp.getNombre());
    //     if (comparado == 0){
    //         return comparado;    
    //     }

    //     comparado = getEdad().compareTo(emp.getEdad());
    //     if (comparado == 0){
    //         return comparado;    
    //     }

    //     comparado = getEdad().compareTo(emp.getEdad());
    //     return comparado;
    // }

    /* ************************* Getters y Setters ************************* */

    public Double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(Double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
}
