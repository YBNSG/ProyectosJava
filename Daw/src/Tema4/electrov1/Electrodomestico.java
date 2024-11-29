package Tema4.electrov1;

public class Electrodomestico {
    // Constantes para valores por defecto
    private static final String DEFAULT_MARCA = "bosch";
    private static final String DEFAULT_MODELO = "7200";
    private static final double DEFAULT_PRECIO = 400.0;
    private static final String DEFAULT_COLOR = "gris";
    private static final int DEFAULT_POTENCIA = 2300;
    private static final int DEFAULT_HORAS_DIA = 1;
    private static final int DEFAULT_DIAS_ANO = 156;
    private static final double DEFAULT_PRECIO_ENERGIA = 0.40397;

    // Atributos
    private String marca;
    private String modelo;
    private double precio;
    private String color;
    private int potencia;
    private int horasDia;
    private int diasAno;
    private double precioEnergia;

    // Constructor por defecto
    public Electrodomestico() {
        this.marca = DEFAULT_MARCA;
        this.modelo = DEFAULT_MODELO;
        this.precio = DEFAULT_PRECIO;
        this.color = DEFAULT_COLOR;
        this.potencia = DEFAULT_POTENCIA;
        this.horasDia = DEFAULT_HORAS_DIA;
        this.diasAno = DEFAULT_DIAS_ANO;
        this.precioEnergia = DEFAULT_PRECIO_ENERGIA;
    }

    // Constructor con marca, modelo y precio
    public Electrodomestico(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = DEFAULT_COLOR;
        this.potencia = DEFAULT_POTENCIA;
        this.horasDia = DEFAULT_HORAS_DIA;
        this.diasAno = DEFAULT_DIAS_ANO;
        this.precioEnergia = DEFAULT_PRECIO_ENERGIA;
    }

    // Constructor con todos los atributos
    public Electrodomestico(String marca, String modelo, double precio, String color, int potencia, int horasDia, int diasAno, double precioEnergia) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.potencia = potencia;
        this.horasDia = horasDia;
        this.diasAno = diasAno;
        this.precioEnergia = precioEnergia;
    }

    // Método para calcular el consumo anual
    public double consumoAnual() {
        double consumoKWh = (potencia * horasDia * diasAno) / 1000.0;
        return consumoKWh * precioEnergia;
    }

    // Método toString
    @Override
    public String toString() {
        return "Electrodomestico(marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "€, color=" + color + ", potencia=" + potencia + "W, horasDia=" + horasDia + ", diasAno=" + diasAno + ", precioEnergia=" + precioEnergia + "€/kWh)";
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getHorasDia() {
        return horasDia;
    }

    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public int getDiasAno() {
        return diasAno;
    }

    public void setDiasAno(int diasAno) {
        this.diasAno = diasAno;
    }

    public double getPrecioEnergia() {
        return precioEnergia;
    }

    public void setPrecioEnergia(double precioEnergia) {
        this.precioEnergia = precioEnergia;
    }
}
