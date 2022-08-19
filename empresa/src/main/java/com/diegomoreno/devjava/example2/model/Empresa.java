package com.diegomoreno.devjava.example2.model;

import java.util.Set;
import java.util.TreeSet;

// import javax.management.RuntimeErrorException;

// import com.diegomoreno.devjava.example2.excepciones.MaximoNumeroClientesException;

public class Empresa {

    /* ************************* Constantes ************************* */
    // Utilizando Java Collection Framework ya no se necesita la constante
    // private static final Integer CANTIDAD_CLIENTES = 1;

    /* ************************* Atributos ************************* */

    private String nombre;

    // * Utilizando Java Collection Framework :
    private Set<Empleado> empleados;
    private Set<Cliente> clientes;

    /*
     * // Sin usar Java Collection Framework :
     * private Empleado[] empleados;
     * private Cliente[] clientes;
     * private Integer numClientes;
     */

    /* ************************* Constructor ************************* */
    // * Utilizando Java Collection Framework :
    public Empresa(String nombre, Set<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.clientes = new TreeSet<>();
    }
    /*
     * * // Sin usar Java Collection Framework :
     * public Empresa(String nombre, Empleado[] empleados) {
     * this.nombre = nombre;
     * this.empleados = empleados;
     * 
     * this.clientes = new Cliente[CANTIDAD_CLIENTES];
     * this.numClientes = 0;
     * }
     */

    /* ************************* Métodos ************************* */
    
    // public void agregarCliente(Cliente cliente) throws MaximoNumeroClientesException {

    public void agregarCliente(Cliente cliente) {
        // Utilizando Java Collection Framework
        clientes.add(cliente);

        /*
         * // Antes de usar Java Collection Framework se realizaba esto :
         * // Validación de datos de entrada
         * if (numClientes >= CANTIDAD_CLIENTES) {
         * throw new
         * MaximoNumeroClientesException("La empresa no puede agregar un cliente mas");
         * }
         * // Proceso
         * clientes[numClientes++] = cliente;
         */
    }

    public void eliminarCliente(Cliente cliente) {
        // Una manera de encontrar el objeto y eliminarlo
        // clientes.contains(cliente);

        // Elimina la primera ocurrencia del cliente que encuentre en la lista
        clientes.remove(cliente);

        /*
         * // Otra manera de hacerlo
         * var pos = clientes.indexOf(cliente);
         * // indexof: retorna -1 si no contiene el elemento dentro de la lista
         * // Si lo contiene procedemos a eliminarlo
         * if (pos != -1){
         * clientes.remove(pos);
         * } else {
         * throw new RuntimeException("El cliente no pertenece a esta empresa");
         * }
         */

    }

    /* ************************* Getters ************************* */

    public String getNombre() {
        return nombre;
    }

    // Utilizando Java Collection Framework :
    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    /*
     * // Antes de usar Java Collection Framework se realizaba esto :
     * public Empleado[] getEmpleados() {
     * return empleados;
     * }
     * 
     * public Cliente[] getClientes() {
     * return clientes;
     * }
     */
}
