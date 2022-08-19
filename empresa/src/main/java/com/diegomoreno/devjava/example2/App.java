package com.diegomoreno.devjava.example2;

// import java.util.ArrayList;
import java.util.TreeSet;

// import com.diegomoreno.devjava.example2.excepciones.MaximoNumeroClientesException;
import com.diegomoreno.devjava.example2.model.Cliente;
import com.diegomoreno.devjava.example2.model.Directivo;
import com.diegomoreno.devjava.example2.model.Empleado;
import com.diegomoreno.devjava.example2.model.Empresa;

public class App {
    public static void main(String[] args) {

        var cesar = new Directivo("Cesar Diaz", 42);
        cesar.setSueldoBruto(3_000_000d);
        // cesar.mostrar();

        /*
         * var maria = new Cliente("Maria Adelaida", 30, "3105551223");
         * maria.setTelefono("3105551223");
         * maria.mostrar();
         */

        var juan = new Directivo("Juan Silva", 25);
        juan.setCategoria("Jefe de Desarrollo");
        // juan.mostrar();

        var gustavo = new Empleado("Gustavo Briceño", 30);
        var ivan = new Empleado("Ivan R.", 25);

        try {
            cesar.agregarSubordinado(juan);
            
            juan.agregarSubordinado(gustavo);
            juan.agregarSubordinado(ivan);
            
        } catch (Exception ex) {
            System.err.println("El directivo no puede agrear mas subordinados");
            // Después de que genere el error corta la función y no sigue ejecutando el
            // proceso
            return;
        }

        // List<Empleado> empleados = new ArrayList<>();
        var empleados = new TreeSet<Empleado>();
        empleados.add(cesar);
        empleados.add(juan);
        empleados.add(gustavo);
        empleados.add(ivan);

        // Clases utilitarias Arrays
        // var empleados = Arrays.asList(cesar, juan, gustavo, ivan);

        var empresa = new Empresa("Grupo 69", empleados);

        /*
         * // Sin usar Java Collection Framework :
         * var empresa = new Empresa("Grupo 69", new Empleado[] {
         * cesar, juan, gustavo, ivan
         * });
         */

        // try {
        var maria = new Cliente("Maria Adelaida", 30, "3105551223");
        empresa.agregarCliente(maria);
        empresa.agregarCliente(new Cliente("Laura Gutierrez", 28));
        // } catch (MaximoNumeroClientesException ex) {
        // System.err.println("Ha ocurrido un error al agregar un cliente\n\t" +
        // ex.getMessage());
        // Después de que genere el error corta la función y no sigue ejecutando el
        // proceso
        // return;
        // }

        // Imprimir
        System.out.printf("La empresa %s tiene los siguientes empleados: %n",
                empresa.getNombre());

        // Lambda : la estructura es (parámetro) -> {bloque de instrucciones, compuesta},
        // si es sencilla no se coloca {}
        empresa.getEmpleados()
                .forEach((empleado) -> {
                    empleado.mostrar();
                    if (empleado instanceof Directivo) {
                        System.out.println("Y sus subordinados son: " +
                                ((Directivo) empleado).getSubordinados()
                                        .stream() // crea un flujo de datos, y los entrega uno a uno
                                        .filter(subordinado -> subordinado.getEdad() > 25)
                                        .map((subordinado) -> subordinado.getNombre())
                                        .reduce((a, b) -> a + ", " + b)
                                        .orElse("Sin subordinados")); // .get()); // obtiene la cadena
                    }
                });

        System.out.println("Y sus clientes son: ");
        empresa.getClientes()
                .forEach((cliente) -> cliente.mostrar());
        /*
         * // Mostrar empleados de una manera diferente a la anterior
         * for (var empleado : empresa.getEmpleados()) {
         * empleado.mostrar();
         * // instancia: si es un objeto que salio de una plantilla de clase
         * if (empleado instanceof Directivo) {
         * // (Directivo): esto es un casting o conversion de tipo
         * var directivo = (Directivo) empleado;
         * System.out.print("Y sus subordinados son: ");
         * var imprimioSubordinado = false;
         * for (var subordinado : directivo.getSubordinados()) {
         * if (subordinado == null) {
         * break;
         * }
         * 
         * if (imprimioSubordinado) {
         * System.out.print(", ");
         * }
         * 
         * System.out.print(subordinado.getNombre());
         * imprimioSubordinado = true;
         * 
         * }
         * System.out.println();
         * }
         * }
         */

        /*
         * System.out.println("Y sus clientes son: ");
         * for (var cliente : empresa.getClientes()) {
         * if (cliente == null) {
         * break;
         * }
         * cliente.mostrar();
         * }
         */
    }

}
