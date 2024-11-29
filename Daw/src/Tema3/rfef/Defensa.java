package Tema3.rfef;
public class Defensa {
    // Atributos
    private String nombre;
    private int edad;
    private int numIntercepciones;

    // Constructor
    public Defensa(String nombre, int edad, int numIntercepciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.numIntercepciones = numIntercepciones;
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

    public int getNumIntercepciones() {
        return numIntercepciones;
    }

    public void setNumIntercepciones(int numIntercepciones) {
        this.numIntercepciones = numIntercepciones;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Número de Intercepciones: " + numIntercepciones);
    }

    // Método para incrementar el número de intercepciones
    public void incrementarIntercepciones() {
        numIntercepciones++;
    }
}

