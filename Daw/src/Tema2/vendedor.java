package Tema2;
import java.util.Scanner;

public class vendedor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir un array para almacenar las ventas de los días de la semana
        double[] ventas = new double[6]; // Martes a Domingo
        
        // Solicitar las ventas diarias
        System.out.println("Introduce las ventas diarias (de Martes a Domingo):");
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Día " + (i + 1) + " (Martes a Domingo): ");
            ventas[i] = scanner.nextDouble();
        }
        
        // Inicializar las variables para hallar el día con más y menos ventas
        double maxVentas = ventas[0];
        double minVentas = ventas[0];
        int diaMaxVentas = 0;
        int diaMinVentas = 0;
        double sumaVentas = 0;
        
        // Recorrer las ventas para calcular suma, máximo y mínimo
        for (int i = 0; i < ventas.length; i++) {
            sumaVentas += ventas[i];
            
            if (ventas[i] > maxVentas) {
                maxVentas = ventas[i];
                diaMaxVentas = i;
            }
            if (ventas[i] < minVentas) {
                minVentas = ventas[i];
                diaMinVentas = i;
            }
        }
        
        // Calcular la media semanal
        double mediaSemanal = sumaVentas / ventas.length;
        
        // Verificar si las ventas del domingo superan la media
        String superaMedia = ventas[5] > mediaSemanal ? "SI" : "NO";
        
        // Utilizando switch para mostrar los días
        System.out.println("El día que más se vende es: " + obtenerDia(diaMaxVentas));
        System.out.println("El día que menos se vende es: " + obtenerDia(diaMinVentas));
        System.out.println("¿Las ventas del domingo superan la media semanal? " + superaMedia);
        
        scanner.close();
    }

    // Función que convierte el índice del día en el nombre del día con un switch
    public static String obtenerDia(int dia) {
        String nombreDia;
        switch (dia) {
            case 0:
                nombreDia = "Martes";
                break;
            case 1:
                nombreDia = "Miércoles";
                break;
            case 2:
                nombreDia = "Jueves";
                break;
            case 3:
                nombreDia = "Viernes";
                break;
            case 4:
                nombreDia = "Sábado";
                break;
            case 5:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día desconocido";
        }
        return nombreDia;
    }
}


