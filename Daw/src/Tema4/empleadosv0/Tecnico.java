package Tema4.empleadosv0;

public class Tecnico {
	private String dni;
	private String nombre;
	/**
	 * @param dni
	 * @param nombre
	 */
	public Tecnico(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Tecnico [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
