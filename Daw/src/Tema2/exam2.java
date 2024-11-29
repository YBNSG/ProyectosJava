package Tema2;
import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú del programa del alumno xxx:");
            System.out.println("1. Opción 1. Usando el bucle for pinta los números pares del 2 al 20.");
            System.out.println("2. Opción 2. Usando while pinta los números impares del 21 al 1 en orden decreciente.");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Parte 2: Código de opción 1 (números pares del 2 al 20 usando for)
                    System.out.println("Números pares del 2 al 20:");
                    for (int i = 2; i <= 20; i += 2) {
                        System.out.print(i + " ");
                    }
                    System.out.println(); // Para nueva línea
                    break;

                case 2:
                    // Parte 3: Código de opción 2 (números impares del 21 al 1 usando while)
                    System.out.println("Números impares del 21 al 1:");
                    int j = 21;
                    while (j >= 1) {
                        System.out.print(j + " ");
                        j -= 2;
                    }
                    System.out.println(); // Para nueva línea
                    break;

                case 3:
                    // Mensaje de salida
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    // Si el usuario ingresa una opción no válida
                    System.out.println("Opción no válida, por favor ingrese una opción entre 1 y 3.");
            }
        } while (opcion != 3); // El menú se repite hasta que el usuario elija salir

        scanner.close();
    }
}
