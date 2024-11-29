package Tema2;
import java.util.Scanner;

public class FactorialJava {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Calcular el factorial
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
