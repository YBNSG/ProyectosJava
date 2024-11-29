package Tema2;
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la nota al usuario
        System.out.print("Introduce una nota de 0 a 10: ");
        double nota = scanner.nextDouble();
        
        // Verificar si la nota está en el rango correcto
        if (nota < 0 || nota > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        } else {
            // Clasificar la nota
            if (nota >= 0 && nota < 3) {
                System.out.println("Cateto");
            } else if (nota >= 3 && nota < 5) {
                System.out.println("Tontico");
            } else if (nota >= 5 && nota < 8) {
                System.out.println("Crack");
            } else if (nota >= 8 && nota <= 10) {
                System.out.println("Señor del círculo");
            }
        }
        
        scanner.close();
    }
}

