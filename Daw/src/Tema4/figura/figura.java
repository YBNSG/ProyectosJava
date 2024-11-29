package Tema4.figura;

public class figura {
    protected double total=0;

    public void mostrarArea() {
        System.out.println("Area: " + this.getClass() + total);
        
    }

    public void calcularArea() {
        // Este metodo debe ser escrito por las clases hijas
        System.out.println("Calculando el area...");
    }
    
}

