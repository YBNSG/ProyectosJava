package Tema3;

public class animales {
	
	static int contador = 0;
	
	contador() {
		contador++;
		System.out.println("Constructor de contador: " +contador);
		
	}

	@Override
	public String toString() {
		return "animales [contador=" + contador + "]";
	}

}
