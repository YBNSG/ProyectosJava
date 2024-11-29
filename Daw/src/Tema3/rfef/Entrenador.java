package Tema3.rfef;
public class Entrenador {
    // Atributos
    private String nombre;
    private int edad;
    private int aniosExperiencia;

    // Constructor
    public Entrenador(String nombre, int edad, int aniosExperiencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
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

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Años de Experiencia: " + aniosExperiencia);
    }

    // Método para incrementar los años de experiencia
    public void incrementarExperiencia() {
        aniosExperiencia++;
    }
}

