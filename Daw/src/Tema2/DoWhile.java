package Tema2;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int maximo = Integer.MIN_VALUE;  // Para almacenar el número más grande

        System.out.println("Introduce números (0 para terminar):");

        // Ciclo para pedir números al usuario hasta que ingrese 0
        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            // Si el número ingresado es mayor que el máximo actual, actualiza el máximo
            if (numero != 0 && numero > maximo) {
                maximo = numero;
            }

        } while (numero != 0);  // El ciclo continúa hasta que el usuario introduzca 0

        // Si no se ingresó ningún número antes del 0
        if (maximo == Integer.MIN_VALUE) {
            System.out.println("No se ingresaron números.");
        } else {
            System.out.println("El número más grande que ingresaste es: " + maximo);
        }

        scanner.close();
    }
}

