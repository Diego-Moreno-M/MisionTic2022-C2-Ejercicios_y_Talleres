import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        var correcto = true;
        Scanner sc = new Scanner(System.in);

        while (correcto) {

            System.out.print("Ingrese el numero del ejercicio que desea ejecutar: ");
            var ejercicio = sc.nextInt();

            switch (ejercicio) {
                case 1:
                    ejercicio1();
                    correcto = false;
                    break;
                case 2:
                    ejercicio2();
                    correcto = false;
                    break;
                case 3:
                    ejercicio3();
                    correcto = false;
                    break;
                case 4:
                    ejercicio4();
                    correcto = false;
                    break;
                case 5:
                    ejercicio5();
                    correcto = false;
                    break;
                case 6:
                    ejercicio6();
                    correcto = false;
                    break;
                case 7:
                    ejercicio7();
                    correcto = false;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    break;
                default:
                    System.out.println("Numero incorrecto");
                    System.out.println("Ingrese un numero de 1 a 15");
                    break;
            }
        }

        sc.close();
    }

    public static void ejercicio1() {

        var cadena = "Mauricio";
        System.out.printf("Hola %s, como van las cosas", cadena);

    }

    public static void ejercicio2() {

        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        var numero = num.nextInt();

        var count = 0; 

        if (numero > 0) {
            while (numero >= 1) {
                numero /= 10;
                count++;
            }
            System.out.printf("el numero tiene %s digito", count);
        } else if (numero == 0){
            System.out.println("El numero tiene una cifra");

        } else {
            System.out.println("Ingrese un numero entero mayor o igual a cero");
        }
        
        num.close();

    }

    public static void ejercicio3() {

        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        var numero = num.nextInt();

        var doble = numero * 2;
        var triple = numero * 3;

        System.out.printf("El doble del numero %s es %s", numero, doble);
        System.out.println();        
        System.out.printf("El triple del numero %s es %s", numero, triple);
        
        num.close();
    
    }

    public static void ejercicio4() {

        Scanner grad = new Scanner(System.in);
        System.out.print("Ingrese los grados centígrados: ");
        var gradosCentigrados = grad.nextDouble();

        var gradosFahrenheit = 0.0;

        gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);

        System.out.printf("%s grados Centígrados son iguales a %s grados Fahrenheit", gradosCentigrados, gradosFahrenheit);
        
        grad.close();
    
    }

    public static void ejercicio5() {

        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        var numero = num.nextDouble();

        var par = "";

        numero = numero % 2;
        par = (numero == 0) ? "es par" : "es impar";

        System.out.println("El numero "+ par);
        
        num.close();
    
    }

    public static void ejercicio6() {

        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese un numero entero numero 1: ");
        var numero1 = num.nextDouble();
        System.out.print("Ingrese un numero entero numero 2: ");
        var numero2 = num.nextDouble();

        var suma = 0.0;
        var resta = 0.0;
        var multiplicacion = 0.0;
        var division = 0.0;

        suma = numero1 + numero2;
        resta = numero1 - numero2;        
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;

        System.out.printf("La suma de %s y %s es igual a %s", numero1, numero2, suma);
        System.out.println();
        System.out.printf("La resta de %s y %s es igual a %s", numero1, numero2, resta);
        System.out.println();
        System.out.printf("La multiplicación de %s y %s es igual a %s", numero1, numero2, multiplicacion);
        System.out.println();
        System.out.printf("La division de %s y %s es igual a %s", numero1, numero2, division);

        num.close();
    
    }

    public static void ejercicio7() {

        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese nombre del alumno: ");
        var alumno = num.nextLine();
        System.out.print("Ingrese nota 1: ");
        var nota1 = num.nextDouble();
        System.out.print("Ingrese nota 2: ");
        var nota2 = num.nextDouble();
        System.out.print("Ingrese nota 3: ");
        var nota3 = num.nextDouble();

        var promedio = 0.0;
        promedio = (nota1 + nota2 + nota3)/3;
        var aprovacion = (promedio >= 3.0) ? "Aprobado" : "Reprobado";

        System.out.printf("El alumno %s saco una nota de %s en promedio por lo cual queda %s", alumno, promedio, aprovacion);
        num.close();
    
    }

}
