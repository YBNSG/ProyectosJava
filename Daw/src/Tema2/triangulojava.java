package Tema2;
import java.util.Scanner;

public class triangulojava{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de filas para el triángulo
        System.out.print("Introduce el número de filas para el triángulo: ");
        int numFilas = scanner.nextInt();

        // Bucle para generar el triángulo
        for (int i = 1; i <= numFilas; i++) {
            // Imprimir espacios en blanco (opcional, para hacer que el triángulo quede alineado)
            for (int j = numFilas - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Salto de línea después de cada fila
            System.out.println();
        }

        scanner.close();
    }
}

