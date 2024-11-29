package Tema4.animales;
public class Animal {
	private String nombre;
	private int edad;
	private String saludar;
	/**
	 * @param nombre
	 * @param edad
	 */
	protected Animal(String paramNombre, int paramEdad)throws Exception {
		super();
		this.nombre = paramNombre;
		this.edad = paramEdad;
		
		if (this instanceof Perro) {
			this.saludar = "Guau";
		} 
		else if (this instanceof Gato) {
			this.saludar = "Miau";
		}
		else {
			throw new Exception ("Esa clase no esta implementada");
		}
	}
	
		
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", edad=" + edad + ", saludar=" + saludar + "]";
	}
	
	

}
