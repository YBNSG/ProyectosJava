package Tema4.figura;

public class Triangulo extends figura {
    private double dBase;
    private double dAltura;

    public Triangulo(double paramBase, double paramAltura) {
        this.dBase = paramBase;
        this.dAltura = paramAltura;
    }

    @Override
    public void calcularArea() {
        this.total = (dBase * dAltura) / 2;
    }
}
