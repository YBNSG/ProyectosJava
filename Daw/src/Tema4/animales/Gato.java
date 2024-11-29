package Tema4.animales;

public class Gato extends Animal {

	/**
	 * @param paramNombre
	 * @param paramEdad
	 * @param paramSaludar
	 * @throws Exception 
	 */
	public Gato(String paramNombre, int paramEdad) throws Exception {
		super(paramNombre, paramEdad);
	}

	@Override
	public String toString() {
		return "Gato [toString()=" + super.toString() + "]";
	}

	
	
	

}
