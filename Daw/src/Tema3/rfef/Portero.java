package Tema3.rfef;
public class Portero {
    // Atributos
    private String nombre;
    private int edad;
    private int numParadas;

    // Constructor
    public Portero(String nombre, int edad, int numParadas) {
        this.nombre = nombre;
        this.edad = edad;
        this.numParadas = numParadas;
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

    public int getNumParadas() {
        return numParadas;
    }

    public void setNumParadas(int numParadas) {
        this.numParadas = numParadas;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Número de Paradas: " + numParadas);
    }

    // Método para incrementar el número de paradas
    public void incrementarParadas() {
        numParadas++;
    }
}
