package Tema2;
public class EjercicioFor {
    public static void main(String[] args) {
        // Bucle for que imprime los números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
     // Bucle for que imprime los números del 10 al 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
    } 


            // Bucle for que imprime los números pares del 10 al 1
            for (int i = 10; i >= 1; i--) {
                // Verificar si el número es par
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
         // Bucle for para sumar los números del 1 al 100
            int suma = 0; // Variable para almacenar la suma
            for (int i = 1; i <= 100; i++) {
                suma += i; // Añadir cada número a la suma          
                System.out.println("La suma de los primeros 100 números es: " + suma);
           
           
            }
            
            
            
    }
}
