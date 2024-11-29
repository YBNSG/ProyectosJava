package Tema4.electrov1;
public class TelevisionTest {
    public static void main(String[] args) {
        // Crear objeto Television solo pasando la resolución
        Television tv1 = new Television(1080);
        System.out.println(tv1);

        // Crear objeto Television pasando todos los parámetros
        Television tv2 = new Television("SAMSUNG", "QLED2021", 1200.0, "negro", 150, 4, 365, 0.30, 65);
        System.out.println(tv2);

        // Mostrar si son iguales
        if (tv1.equals(tv2)) {
            System.out.println("Las televisiones son iguales.");
        } else {
            System.out.println("Las televisiones son diferentes.");
        }
    }
}



