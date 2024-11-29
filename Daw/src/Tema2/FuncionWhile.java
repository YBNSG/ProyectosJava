package Tema2;
public class FuncionWhile {
    public static void main(String[] args) {
        // Inicializamos el contador en 5
        int contador = 5;

        // Usamos un bucle while para imprimir los primeros 5 números
        while (contador >= 1) {
            System.out.println(contador);
            contador--;  // Incrementamos el contador en 1
            
         
            // Inicializamos el contador para contar los números pares
            int contador1 = 1;
        
           
            // Inicializamos el número para empezar desde 2 (primer número par)
            int numero = 2;

         
            // Usamos un bucle while para imprimir los primeros 10 números pares
            while (contador1 <= 10) {
                System.out.println(numero);
                numero += 2;  // Incrementamos el número en 2 (número par siguiente)
                contador1++;   // Incrementamos el contador para controlar la cantidad de números impresos
            }
 }
    }

}