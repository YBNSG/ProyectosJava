package Tema3;
public class ClasePersonaTest {
public static void main(String[] args) {
ClasePersona alumnoDAW = new ClasePersona("Ivan", (byte) 19, 1.76);
System.out.println("Datos del alumnoDAW=" + alumnoDAW+"\n");
//Vemos el saludo de Luis
alumnoDAW.saludar();
//Luis cumple Años
alumnoDAW.cumplirAnyos();
//Y ha crecido
alumnoDAW.crecer(0.05);
//Volvemos a ver los datos de Luis
System.out.println("\nDatos del alumnoDAW=" + alumnoDAW+"\n");}}