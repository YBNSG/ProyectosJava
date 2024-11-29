package Tema3.rfef;
public class Delantero {
    // Atributos
    private String nombre;
    private int edad;
    private int numGoles;

    // Constructor
    public Delantero(String nombre, int edad, int numGoles) {
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Número de Goles: " + numGoles);
    }

    // Método para incrementar el número de goles
    public void incrementarGoles() {
        numGoles++;
    }
}

