package Tema2;
import java.util.Scanner;

public class NumerosNega {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variables para acumular sumas, contar positivos, negativos y ceros
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;
        int cantidadCeros = 0;

        // Solicitar 5 números al usuario
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                // Sumar y contar números positivos
                sumaPositivos += numero;
                cantidadPositivos++;
            } else if (numero < 0) {
                // Sumar y contar números negativos
                sumaNegativos += numero;
                cantidadNegativos++;
            } else {
                // Contar los ceros
                cantidadCeros++;
            }
        }

        // Calcular la media de los números positivos y negativos
        double mediaPositivos = (cantidadPositivos > 0) ? (double) sumaPositivos / cantidadPositivos : 0;
        double mediaNegativos = (cantidadNegativos > 0) ? (double) sumaNegativos / cantidadNegativos : 0;

        // Mostrar los resultados
        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + cantidadCeros);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

