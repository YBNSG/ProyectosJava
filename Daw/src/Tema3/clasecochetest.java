package Tema3;

public class clasecochetest {

	 // Método principal para probar la clase Coche
    public static void main(String[] args) {
        // Crear un objeto Coche
        clasecoche miCoche = new clasecoche("Toyota", "Corolla", 2021, "Rojo");

        // Mostrar la información del coche
        miCoche.mostrarInfo();

        // Acelerar el coche
        miCoche.acelerar(50);

        // Frenar el coche
        miCoche.frenar(20);

        // Cambiar el color del coche
        miCoche.repintar("Azul");

        // Mostrar nuevamente la información del coche
        miCoche.mostrarInfo();  
        
        
    }}
