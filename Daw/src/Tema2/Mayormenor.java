package Tema2;
import java.util.Scanner;
public class Mayormenor {

	public static void main(String[] args) {
		//Pedir dos números y los muestre ordenados de mayor a menor
		
		 // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
     // Pedir al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        
        // Comparar los números usando la sentencia if
        if (num1 > num2) {
            System.out.println("Numero mayor es " +  num1  +  "Numero menor es"  +  num2);
        } else {
            System.out.println("Numero mayor es " +  num2  +  "Numero menor es"  +  num1);
        }

        // Cerrar el objeto Scanner
        scanner.close();

		
		

	}

}
