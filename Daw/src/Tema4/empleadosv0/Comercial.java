package Tema4.empleadosv0;

public class Comercial {
	private String dni;
	private String nombre;
	private double comisión;
	/**
	 * @param dni
	 * @param nombre
	 * @param comisión
	 */
	public Comercial(String dni, String nombre, double comisión) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.comisión = comisión;
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
	/**
	 * @return the comisión
	 */
	public double getComisión() {
		return comisión;
	}
	/**
	 * @param comisión the comisión to set
	 */
	public void setComisión(double comisión) {
		this.comisión = comisión;
	}
	@Override
	public String toString() {
		return "Comercial [dni=" + dni + ", nombre=" + nombre + ", comisión=" + comisión + "]";
	}
	
	
	

}
