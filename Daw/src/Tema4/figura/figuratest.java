package Tema4.figura;

public class figuratest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangulo rectangulo = new Rectangulo(5.0, 4.0);
	        rectangulo.calcularArea();
	        rectangulo.mostrarArea();

	        Triangulo triangulo = new Triangulo(6.0, 3.0);
	        triangulo.calcularArea();
	        triangulo.mostrarArea();

	        Circulo circulo = new Circulo(3.0);
	        circulo.calcularArea();
	        circulo.mostrarArea();
	    }
	}