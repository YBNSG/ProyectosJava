package Tema4.empleadosv0;

public class Directivo {
	private String dni;
	private String nombre;
	private String departamento;
	/**
	 * @param dni
	 * @param nombre
	 * @param departamento
	 */
	public Directivo(String dni, String nombre, String departamento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.departamento = departamento;
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
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}
	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Directivo [dni=" + dni + ", nombre=" + nombre + ", departamento=" + departamento + "]";
	}
	

}
