package Tema2;
public class PrimerosPrimos {
    public static void main(String[] args) {
        int count = 0;  // Contador de números primos encontrados
        int num = 2;    // El número que estamos comprobando si es primo

        while (count < 20) {  // Queremos los primeros 20 primos
            int divisores = 0;
            for (int i = 1; i <= num; i++) {  // Verificar si el número es primo
                if (num % i == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {  // Si solo tiene dos divisores (1 y el propio número)
                System.out.println(num);  // Es primo, lo imprimimos
                count++;  // Aumentamos el contador de primos encontrados
            }
            num++;  // Pasamos al siguiente número
        }
    }
}


