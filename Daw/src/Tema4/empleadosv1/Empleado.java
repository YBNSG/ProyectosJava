package Tema4.empleadosv1;

public class Empleado {
	private String dni;
	private String nombre;
	private String puesto;
	/**
	 * @param dni
	 * @param nombre
	 * @param puesto
	 */
	public Empleado(String dni, String nombre, String puesto) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.puesto = puesto;
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
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}
	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", puesto=" + puesto + "]";
	}
	

}
