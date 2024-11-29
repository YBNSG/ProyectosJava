package Tema2;
import java.util.Scanner;

public class EjercicioGranja {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variables necesarias
        double comidaDiaria;
        int numAnimales;
        double kilosPorAnimal;

        // Pedimos al usuario los datos
        System.out.println("Introduce la cantidad de comida disponible (en kilos):");
        comidaDiaria = scanner.nextDouble();

        System.out.println("Introduce el número de animales:");
        numAnimales = scanner.nextInt();

        // Validar que el número de animales no sea cero
        if (numAnimales == 0) {
            System.out.println("El número de animales no puede ser cero.");
            return;
        }

        System.out.println("Introduce la cantidad de kilos que come cada animal:");
        kilosPorAnimal = scanner.nextDouble();

        // Calcular la comida total necesaria
        double comidaNecesaria = numAnimales * kilosPorAnimal;

        // Usamos un switch para determinar si hay suficiente comida
        switch (comidaDiaria >= comidaNecesaria ? "suficiente" : "insuficiente") {
            case "suficiente":
                System.out.println("Hay suficiente comida para todos los animales.");
                break;

            case "insuficiente":
                System.out.println("No hay suficiente comida para todos los animales.");
                // Calculamos la ración a repartir
                double racionPorAnimal = comidaDiaria / numAnimales;
                System.out.printf("Cada animal recibirá %.2f kilos de comida.\n", racionPorAnimal);
                break;

            default:
                System.out.println("Error en el cálculo.");
                break;
        }

        // Cerramos el scanner
        scanner.close();
    }
}
