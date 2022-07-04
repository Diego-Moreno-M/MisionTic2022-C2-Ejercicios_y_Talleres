import java.util.Scanner;

public class Sentencias {
    public static void main(String[] args) {
        ciclos2();
    }

    private static void condicionales() {

        var sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("El numero es negativo");
        } else if (numero > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es cero");
        }

        sc.close();

    }

    private static void condicionales2() {

        var sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        var letra = sc.nextLine();

        switch (letra.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
                break;
        }

        sc.close();

    }

    private static void ciclos1() {
        var numero = 5;

        while (numero > 0) {
            System.out.println(numero);
            numero--;
        }
        System.out.println("Boom!");
    }

    private static void ciclos2() {
    
        var numero = 10;
        
        do {
            System.out.println(numero);
            numero--;
        } while (numero > 0);
        System.out.println("Despegue!");
    }

    private static void ciclos3() {

        for(var numero = 5; numero > 0; numero--){
            System.out.println(numero);
        }
        System.out.println("Boooooooom!");
    }

    private static void ciclos4() {
        // Foreach
        
        var frutas = new String[]{
            "Manzana", "Pera", "Naranja", "Mandarina", "Limon"
        };
        for (var fruta : frutas) {
            System.out.println("La fruta es: "+ fruta);
        }

        var numeros = new int[]{
            10, 32, 1, 44, 17, 23, 1
        };
        for (var numero : numeros) {
            if (numero % 3 == 0){
                continue;
            } else if (numero > 20 && !(numero % 2 == 0)){
                break;
            }
            System.out.println("La numero es: "+ numero);
        }
    }
}
