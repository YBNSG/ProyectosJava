package Tema2;
import java.util.Scanner;

public class radar {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer entradas desde la consola
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            // Solicitar los tres números
            System.out.print("Introduce la distancia entre las dos cámaras (en metros): ");
            double distancia = scanner.nextDouble();

            System.out.print("Introduce la velocidad máxima del tramo (en km/h): ");
            double velocidadMaxima = scanner.nextDouble();

            System.out.print("Introduce el tiempo en segundos que ha tardado el vehículo en recorrer el tramo: ");
            double tiempo = scanner.nextDouble();

            // Convertir la velocidad máxima de km/h a m/s
            double velocidadMaximaMS = velocidadMaxima * 1000 / 3600;

            // Calcular la velocidad del vehículo en m/s
            double velocidadVehiculoMS = distancia / tiempo;

            // Convertir la velocidad del vehículo a km/h para comparaciones posteriores
            double velocidadVehiculoKMH = velocidadVehiculoMS * 3600 / 1000;

            // Calcular el 20% de la velocidad máxima
            double limite20PorCiento = velocidadMaxima * 1.20;

            // Mostrar la velocidad del vehículo
            System.out.printf("La velocidad del vehículo es %.2f km/h\n", velocidadVehiculoKMH);

            // Comprobar si el vehículo ha excedido el límite de velocidad y qué multa aplicar
            if (velocidadVehiculoKMH <= velocidadMaxima) {
                System.out.println("No hay multa, el vehículo no ha excedido el límite de velocidad.");
            } else if (velocidadVehiculoKMH <= limite20PorCiento) {
                System.out.println("Multa sin puntos, el vehículo ha excedido la velocidad pero no más del 20% del límite.");
            } else {
                System.out.println("Multa con puntos, el vehículo ha excedido el 20% del límite de velocidad.");
            }

            // Preguntar si el usuario desea continuar con otro caso
            System.out.print("¿Quieres introducir otro caso? (s/n): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));  // El bucle continúa si el usuario introduce 's' o 'S'

        // Cerrar el scanner
        scanner.close();
    }
}
