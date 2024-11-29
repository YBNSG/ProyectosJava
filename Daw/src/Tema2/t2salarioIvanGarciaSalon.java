package Tema2;
import java.util.Scanner;

public class t2salarioIvanGarciaSalon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar las horas al trabajador
        System.out.print("Introduce las horas que has trabajado: ");
        double dinero = scanner.nextDouble();
        
        //Calcular dinero que ha generado el trabajador
        if (dinero <= 35 ) {
            System.out.println(dinero*40);
        } else if (dinero>35) {
            System.out.println(dinero*60);
        }
        
        // Verificar las tasas de los salarios para aplicarlas
        if (dinero>=500) {
            System.out.println("No se aplican tasas salen gratis");
            if (dinero >500) {
                System.out.println( dinero*0.25);
            } else if (dinero>900) {
                System.out.println(dinero*0.45);
          
        
        scanner.close();
    }
        }}}

