package Tema4.electro;

public class Television extends Electrodomestico {
    // Atributos adicionales
    private int resolucion;

    // Constructor por defecto
    public Television() {
        super("LG", "OLED55C1", 1000, "negro", 150, 4, 200, 0.40397);
        this.resolucion = 55;
    }

    // Constructor con la resolución especificada
    public Television(int resolucion) {
        super("LG", "OLED55C1", 1000, "negro", 150, 4, 200, 0.40397);
        this.resolucion = resolucion;
    }

    // Constructor con todos los atributos
    public Television(String marca, String modelo, double precio, String color, int potencia, int horasDia, int diasAno, double precioEnergia, int resolucion) {
        super(marca, modelo, precio, color, potencia, horasDia, diasAno, resolucion);
        
    }

    // Método para calcular el consumo anual con tasa adicional si resolución > 50 pulgadas
    @Override
    public double consumoAnual() {
        double consumoEuros = super.consumoAnual();
        if (resolucion > 50) {
            consumoEuros += 30; // Tasa adicional de 30€ si la resolución es mayor de 50 pulgadas
        }
        return consumoEuros;
    }

    // Método toString
    @Override
    public String toString() {
        return "Television(marca=" + getMarca() + ", modelo=" + getModelo() + ", precio=" + getPrecio() + "€, color=" + getColor() + ", potencia=" + getPotencia() + "W, horasDia=" + getHorasDia() + ", diasAno=" + getDiasAno() + ", precioEnergia=" + getPrecioEnergia() + "€/kWh, resolucion=" + resolucion + " pulgadas)";
    }

    // Getters y Setters para resolución
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
}