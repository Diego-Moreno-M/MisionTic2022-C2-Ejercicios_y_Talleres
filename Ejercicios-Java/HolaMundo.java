import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = sc.nextLine();
        sc.close();

        var plantilla = "Hola %s!";
        System.out.printf(plantilla, nombre);
        
        /* 
        var mensaje = "Hola " + nombre + "!";
        System.out.println(mensaje);
        */

        /* 
        System.out.print("Hola ");
        System.out.print(nombre);
        System.out.println("!");
        */
    }   
}