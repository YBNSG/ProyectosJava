package Tema2;
import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca un número
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        // Usar la declaración if para verificar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        
        // Cerrar el escáner
        scanner.close();
    }
}

		
		
		

	