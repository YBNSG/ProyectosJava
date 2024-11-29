package Tema2;
import java.util.Scanner;
public class whilebinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s"; // Para controlar el ciclo
        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Introduce un número entero: ");
            int numero = scanner.nextInt();
            
            // Convertimos el número a binario
            String binario = Integer.toBinaryString(numero);
            System.out.println("El número " + numero + " en binario es: " + binario);

            // Preguntamos si quiere continuar
            System.out.print("¿Deseas convertir otro número? (s/n): ");
            continuar = scanner.next();
        }
        System.out.println("Programa finalizado.");
        scanner.close();
    }
}

