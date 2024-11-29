package Tema3.rfef;
public class Centrocampista {
    // Atributos
    private String nombre;
    private int edad;
    private int numAsistencias;

    // Constructor
    public Centrocampista(String nombre, int edad, int numAsistencias) {
        this.nombre = nombre;
        this.edad = edad;
        this.numAsistencias = numAsistencias;
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

    public int getNumAsistencias() {
        return numAsistencias;
    }

    public void setNumAsistencias(int numAsistencias) {
        this.numAsistencias = numAsistencias;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Número de Asistencias: " + numAsistencias);
    }

    // Método para incrementar el número de asistencias
    public void incrementarAsistencias() {
        numAsistencias++;
    }
}
