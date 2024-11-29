package Tema3;

public class clasecoche {

	    // Atributos de la clase Coche
	    private String marca;
	    private String modelo;
	    private int anio;
	    private String color;
	    private double velocidad;

	    // Constructor para inicializar el objeto
	    public clasecoche(String marca, String modelo, int anio, String color) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.anio = anio;
	        this.color = color;
	        this.velocidad = 0.0; // Inicialmente la velocidad es 0
	    }

	    // Método para acelerar el coche
	    public void acelerar(double incremento) {
	        if (incremento > 0) {
	            velocidad += incremento;
	            System.out.println("El coche ha acelerado a " + velocidad + " km/h.");
	        } else {
	            System.out.println("El incremento debe ser positivo.");
	        }
	    }

	    // Método para frenar el coche
	    public void frenar(double reduccion) {
	        if (reduccion > 0) {
	            velocidad -= reduccion;
	            if (velocidad < 0) {
	                velocidad = 0; // No se permite velocidad negativa
	            }
	            System.out.println("El coche ha frenado a " + velocidad + " km/h.");
	        } else {
	            System.out.println("La reducción debe ser positiva.");
	        }
	    }

	    // Método para pintar el coche de otro color
	    public void repintar(String nuevoColor) {
	        this.color = nuevoColor;
	        System.out.println("El coche ahora es de color " + color + ".");
	    }

	    // Método para mostrar información del coche
	    public void mostrarInfo() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Año: " + anio);
	        System.out.println("Color: " + color);
	        System.out.println("Velocidad actual: " + velocidad + " km/h");
	    }

	   
	}

