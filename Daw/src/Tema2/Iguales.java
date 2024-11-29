package Tema2;
import java.util.Scanner;
public class Iguales {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        // Comparar los números usando la sentencia if
        if (num1 == num2) {
            System.out.println("Los dos números son iguales.");
        } else {
            System.out.println("Los dos números son diferentes.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
        
   
    }
}



