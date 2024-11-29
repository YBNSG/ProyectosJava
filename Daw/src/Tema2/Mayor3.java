package Tema2;
import java.util.Scanner;

public class Mayor3 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca tres números
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();
        
        // Variables para almacenar los números en orden
        int mayor = 0, medio = 0, menor = 0;
        
        // Comparar los números y ordenarlos de mayor a menor
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }
        
        // Mostrar los números ordenados
        System.out.println("Números ordenados de mayor a menor: " + mayor + " > " + medio + " > " + menor);
        
        // Cerrar el escáner
        scanner.close();
    }
}
