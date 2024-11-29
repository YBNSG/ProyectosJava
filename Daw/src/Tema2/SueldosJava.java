package Tema2;
import java.util.Scanner;

public class SueldosJava {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variables para acumular la suma de sueldos y contar los mayores de 1000€
        double sumaSueldos = 0;
        int cantidadMayores1000 = 0;

        // Solicitar 5 sueldos al usuario
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresa el sueldo " + i + ": ");
            double sueldo = scanner.nextDouble();

            // Sumar el sueldo al total
            sumaSueldos += sueldo;

            // Contar si el sueldo es mayor de 1000€
            if (sueldo > 1000) {
                cantidadMayores1000++;
            }
        }

        // Calcular la media de los sueldos
        double mediaSueldos = sumaSueldos / 5;

        // Mostrar los resultados
        System.out.println("Suma de los sueldos: " + sumaSueldos + "€");
        System.out.println("Media de los sueldos: " + mediaSueldos + "€");
        System.out.println("Cantidad de sueldos mayores de 1000€: " + cantidadMayores1000);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

