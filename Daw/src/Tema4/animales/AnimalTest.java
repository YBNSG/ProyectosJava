package Tema4.animales;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Perro dog = new Perro ("Bizcochito",5);
			Gato cat = new Gato("Rapunzel",6);
			System.out.println(dog.toString()+cat);
			

		}
			catch (Exception miExcep) {
				System.out.println("Se ha producido el siguiente fallo: " +miExcep.getMessage());}

	}

}
