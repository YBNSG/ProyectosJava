package Tema4.animales;

public class Perro extends Animal {

	/**
	 * @param paramNombre
	 * @param paramEdad
	 * @param paramSaludar
	 * @throws Exception 
	 */
	public Perro(String paramNombre, int paramEdad) throws Exception {
		super(paramNombre, paramEdad);
	}

	@Override
	public String toString() {
		return "Perro [toString()=" + super.toString() + "]";
	}




	
	

}
