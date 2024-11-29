package Tema2;
import java.util.Scanner;

public class EjercicioSalarioClase{
    public static void main(String[] args) {
        // Crear objeto Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las horas trabajadas y la tarifa por hora
        System.out.print("Introduce el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("Introduce la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();

        // Variables para el salario
        double salario = 0;
        double tasa = 0;

        // Calcular el salario base
        if (horasTrabajadas <= 35) {
            salario = horasTrabajadas * tarifaPorHora;
        } else {
            // Si trabaja más de 35 horas, las primeras 35 horas se pagan a tarifa normal,
            // y el resto se pagan como horas extra (1.5 veces la tarifa normal)
            salario = 35 * tarifaPorHora + (horasTrabajadas - 35) * tarifaPorHora * 1.5;
        }

        // Aplicar las tasas según el salario
        if (salario <= 500) {
            tasa = 0; // No se aplica tasa
        } else if (salario > 500 && salario <= 900) {
            tasa = 0.20; // Tasa del 20%
        } else {
            tasa = 0.40; // Tasa del 40%
        }

        // Calcular el salario neto después de aplicar la tasa
        double salarioNeto = salario - (salario * tasa);

        // Mostrar el resultado
        System.out.println("El salario bruto es: " + salario + " euros.");
        System.out.println("El salario neto después de aplicar la tasa es: " + salarioNeto + " euros.");
    }
}
