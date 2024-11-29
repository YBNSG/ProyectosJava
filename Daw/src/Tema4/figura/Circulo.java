package Tema4.figura;

public class Circulo extends figura {
    private static final double PI = 3.1416;
    private double radio;

    public Circulo(double paramRadio) {
        this.radio = paramRadio;
    }

    @Override
    public void calcularArea() {
        this.total = PI * radio * radio;
    }
}