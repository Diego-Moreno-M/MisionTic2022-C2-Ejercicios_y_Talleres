/* **********************************************
# * Ejercicios clase 1 Programación Básica Java
# * Autor: Diego Armando Moreno Meneses
# * Fecha de creación: 02/07/2022
# * Fecha de modificación: 03/07/2022
# ***********************************************/

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
                    ejercicio8();
                    correcto = false;
                    break;
                case 9:
                    ejercicio9();
                    correcto = false;
                    break;
                case 10:
                    ejercicio10();
                    correcto = false;
                    break;
                case 11:
                    ejercicio11();
                    correcto = false;
                    break;
                case 12:
                    ejercicio12();
                    correcto = false;
                    break;
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
            System.out.printf("el numero tiene %d dígitos", count);
        } else if (numero == 0) {
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

        System.out.printf("El doble del numero %d es %d %n", numero, doble);
        System.out.printf("El triple del numero %d es %d", numero, triple);

        num.close();

    }

    public static void ejercicio4() {

        Scanner grad = new Scanner(System.in);
        System.out.print("Ingrese los grados centígrados: ");
        var gradosCentigrados = grad.nextFloat();

        var gradosFahrenheit = 0.0;

        gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);

        System.out.printf("%.2f grados Centígrados son iguales a %.2f grados Fahrenheit", gradosCentigrados,
                gradosFahrenheit);

        grad.close();

    }

    public static void ejercicio5() {

        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        var numero = num.nextInt();

        var par = "";

        numero = numero % 2;
        par = (numero == 0) ? "es par" : "es impar";

        System.out.println("El numero " + par);

        num.close();

    }

    public static void ejercicio6() {

        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese un numero entero numero 1: ");
        var numero1 = num.nextFloat();
        System.out.print("Ingrese un numero entero numero 2: ");
        var numero2 = num.nextFloat();

        var suma = 0.0;
        var resta = 0.0;
        var multiplicacion = 0.0;
        var division = 0.0;

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;

        System.out.printf("La suma de %.2f y %.2f es igual a %.2f %n", numero1, numero2, suma);
        System.out.printf("La resta de %.2f y %.2f es igual a %.2f %n", numero1, numero2, resta);
        System.out.printf("La multiplicación de %.2f y %.2f es igual a %.2f %n", numero1, numero2, multiplicacion);
        System.out.printf("La division de %.2f y %.2f es igual a %.2f", numero1, numero2, division);

        num.close();

    }

    public static void ejercicio7() {

        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese nombre del alumno: ");
        var alumno = num.nextLine();
        System.out.print("Ingrese nota 1: ");
        var nota1 = num.nextFloat();
        System.out.print("Ingrese nota 2: ");
        var nota2 = num.nextFloat();
        System.out.print("Ingrese nota 3: ");
        var nota3 = num.nextFloat();

        var promedio = 0.0;
        promedio = (nota1 + nota2 + nota3) / 3;
        var aprovacion = (promedio >= 3.0) ? "Aprobado" : "Reprobado";

        System.out.printf("El alumno %s saco una nota de %.2f en promedio por lo cual queda %.2f", alumno, promedio,
                aprovacion);
        num.close();

    }

    public static void ejercicio8() {

        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas en el mes: ");
        var horas = num.nextInt();

        var sueldo = 0;
        sueldo = horas * 30000;

        System.out.printf("El sueldo del trabajador por las %d horas de trabajo es: %d", horas, sueldo);
        num.close();

    }

    public static void ejercicio9() {

        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese numero de las tablas de multiplicar que desea ver: ");
        var numero = num.nextInt();

        var resultado = 0;

        for (var i = 0; i <= 10; i++) {
            resultado = i * numero;
            System.out.printf("%d * %d = %d %n", i, numero, resultado);
        }
        num.close();

    }

    public static void ejercicio10() {

        var numAleatorio = Math.round(Math.random() * 100 + 1);

        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese numero y adivina que numero uso el sistema: ");
        var numero = num.nextLong();

        while (numAleatorio != numero) {
            if (numAleatorio < numero) {
                System.out.print("El numero ingresado es mayor al numero del sistema ingrese un nuevo numero: ");
                numero = num.nextLong();
            } else {
                System.out.print("El numero ingresado es menor al numero del sistema ingrese un nuevo numero: ");
                numero = num.nextLong();
            }
        }
        System.out.printf("Felicitaciones adivinaste el numero que pensó el sistema! el numero es %d %n", numAleatorio);
        num.close();

    }

    public static void ejercicio11() {

        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese su sexo letra en mayúscula (H/M): ");
        var sexo = num.nextLine();
        System.out.print("Ingrese altura (cm): ");
        var altura = num.nextInt();

        var pesoIdeal = 0;

        if (sexo.equals("H")) {
            pesoIdeal = altura - 100;
        } else if (sexo.equals("M")) {
            pesoIdeal = altura - 110;
        }

        System.out.printf("Su peso ideal debe ser de %d (Kg) %n", pesoIdeal);
        num.close();

    }

    public static void ejercicio12() {

        Scanner num = new Scanner(System.in);
        String respuesta;
        int count;
        int modulo;
        int numero;

        do {

            System.out.print("Ingrese un numero entero mayor a cero: ");
            numero = num.nextInt();
            count = 1;
            modulo = 0;

            if (numero == 1) {
                System.out.printf("El numero %d no es primo %n", numero);
            } else if (numero == 2) {
                System.out.printf("El numero %d es primo %n", numero);
            } else {
                for (int i = 2; i < numero; i++) {
                    modulo = numero % i;
                    if (modulo == 0) {
                        count += 1;
                    } else {
                        continue;
                    }
                    if (count == 3) {
                        System.out.printf("El numero %d no es primo %n", numero);
                        break;
                    }
                }
            }

            System.out.print("Quieres ingresar un nuevo numero (S/N): ");
            respuesta = num.next();

        } while (respuesta.equals("S"));

        num.close();

    }

}
