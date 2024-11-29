package Tema2;
import java.util.Scanner;

public class errores{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Solicitar el primer número
            System.out.print("Introduce el primer número: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            // Solicitar el segundo número
            System.out.print("Introduce el segundo número: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            // Realizar la división
            int resultado = dividir(num1, num2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (NumberFormatException e) {
            // Captura si el usuario introduce algo que no es un número
            System.out.println("Error: Por favor, introduce un número válido.");
        } catch (ArithmeticException e) {
            // Captura la división por cero
            System.out.println("Error: No se puede dividir entre cero.");
        } catch (Exception e) {
            // Captura cualquier otra excepción inesperada
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            // Este bloque se ejecuta siempre, ocurra o no una excepción
            System.out.println("Finalizando el programa.");
        }

        scanner.close();
    }

    // Función para dividir dos números
    public static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
