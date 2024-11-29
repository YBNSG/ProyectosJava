package Tema4.electrov1;

public class ElectroTest {

	public class Main {
	    public static void main(String[] args) {
	        Electrodomestico electrodomestico1 = new Electrodomestico();
	        Electrodomestico electrodomestico2 = new Electrodomestico("Samsung", "X100", 500);
	        Electrodomestico electrodomestico3 = new Electrodomestico("Sony", "Y200", 600, "Blanco", 1800, 2, 250, 0.35);

	        System.out.println(electrodomestico1);
	        System.out.println(electrodomestico2);
	        System.out.println(electrodomestico3);

	        Television television1 = new Television();
	        Television television2 = new Television(60);

	        System.out.println(television1);
	        System.out.println(television2);

	        System.out.printf("Consumo anual electrodomestico1: %.2f€\n", electrodomestico1.consumoAnual());
	        System.out.printf("Consumo anual television1: %.2f€\n", television1.consumoAnual());
	    }
	}
}
