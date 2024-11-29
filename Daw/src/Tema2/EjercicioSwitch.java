package Tema2;
import java.util.Scanner;

public class EjercicioSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una nota numérica entre 0 y 10: ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 0: case 1: case 2:
                System.out.println("Resultado: Cateto");
                break;
            case 3: case 4:
                System.out.println("Resultado: Muy Deficiente");
                break;
            case 5:
                System.out.println("Resultado: Insuficiente");
                break;
            case 6: case 7:
                System.out.println("Resultado: Suficiente");
                break;
            case 8: case 9:
                System.out.println("Resultado: Notable");
                break;
            case 10:
                System.out.println("Resultado: Sobresaliente");
                break;
            default:
                if (nota < 0 || nota > 10) {
                    System.out.println("Error: Nota fuera de rango (debe estar entre 0 y 10).");
                }
                break;
        }

        scanner.close();
    }
}

