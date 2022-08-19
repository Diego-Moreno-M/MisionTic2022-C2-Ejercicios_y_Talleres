package com.diegomoreno.devjava.example2.model;

import java.util.ArrayList;
import java.util.List;

/* 
 * // Importar Excepción para manejo de errores 
 * import com.diegomoreno.devjava.example2.excepciones.MaximoNumeroSubordinadosException; 
*/

public class Directivo extends Empleado {

    /* ************************* Constantes ************************* */

    private static final String CATEGORIA_POR_DEFECTO = "No asignado";
    // Utilizando Java Collection Framework ya no se necesita la constante
    // private static final Integer CANTIDAD_SUBORIDNADOS = 10;

    /* ************************* Atributos ************************* */

    private String categoria;

    // Utilizando Java Collection Framework :
    private List<Empleado> subordinados;

    // Sin usar Java Collection Framework :
    /*
     * private Empleado[] subordinados;
     * private Integer numSubordinados;
     */

    /* ************************* Constructor ************************* */

    public Directivo(String nombre, Integer edad) {
        this(nombre, edad, SUELDO_POR_DEFECTO);
    }

    public Directivo(String nombre, Integer edad, Double sueldoBruto) {
        this(nombre, edad, sueldoBruto, CATEGORIA_POR_DEFECTO);
    }

    public Directivo(String nombre, Integer edad, String categoria) {
        this(nombre, edad, SUELDO_POR_DEFECTO, categoria);
    }

    public Directivo(String nombre, Integer edad, Double sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;

        // antes de usar Java Collection Framework se creaba asi el objeto :
        /*
         * this.subordinados = new Empleado[CANTIDAD_SUBORIDNADOS];
         * this.numSubordinados = 0;
         */

        // Ahora se tiene que hacer de la siguiente manera y ya no se coloca Empleado
        // ArrayList<"Empleado">
        // ya que se coloco al inicializar la variable
        this.subordinados = new ArrayList<>();

    }

    /* ************************* Métodos ************************* */
    // @Override: anotación, este método es una sobre escritura del método del padre

    @Override
    public void mostrar() {
        System.out.printf(
                "El directivo de nombre %s tiene %d años, un sueldo de $ %,.2f y su categoria es %s %n",
                getNombre(), getEdad(), getSueldoBruto(), categoria);
    }

    @Override
    public Double getSueldoBruto() {
        return super.getSueldoBruto() + 100_000d;
    }

    public void agregarSubordinado(Empleado empleado) {
        // Utilizando Java Collection Framework
        subordinados.add(empleado);

        /*
         * // Antes de usar Java Collection Framework se realizaba esto :
         * // Validación de datos de entrada
         * if (numSubordinados >= CANTIDAD_SUBORIDNADOS) {
         * throw new MaximoNumeroSubordinadosException();
         * }
         * // Proceso
         * subordinados[numSubordinados++] = empleado;
         */
    }

    /* ************************* Getters y Setters ************************* */

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Utilizando Java Collection Framework
    public List<Empleado> getSubordinados() {
        return subordinados;
    }
    /*
     * // Antes de usar Java Collection Framework se realizaba esto :
     * public Empleado[] getSubordinados() {
     * return subordinados;
     * }
     */
}
