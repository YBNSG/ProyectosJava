package Tema4.figura;

public class Rectangulo extends figura {
    private double base;
    private double altura;

    public Rectangulo(double paramBase, double paramAltura) {
        this.base = paramBase;
        this.altura = paramAltura;
    	}
    @Override
    public void calcularArea() {
        this.total = base * altura;
    }
}

