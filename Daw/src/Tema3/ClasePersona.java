package Tema3;

public class ClasePersona {
    // Atributos
    private String nombre;
    private byte edad;
    private double altura; // decimales

    // Constructor
    public ClasePersona(String nombre, byte edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Metodo para pintar el saluda
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    // Metodo para incrementar los años
    public void cumplirAnyos() {
        edad++;
        System.out.println(nombre + " ha cumplido años. Ahora tiene " + edad + " años.");
    }

    // Metodo para incrementar la altura
    public void crecer(double incremento) {
        altura += incremento;
        System.out.println(nombre + " ha crecido " + incremento + " metros. Ahora mide " + altura + " metros.");
    }

    // Overriding toString method to display Persona object details
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + " años, Altura: " + altura + " metros";
    }
}

