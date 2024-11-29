package Tema4.empleadosv1;

public class Directivo extends Empleado {
	private String Departamento;

	/**
	 * @param dni
	 * @param nombre
	 * @param puesto
	 * @param departamento
	 */
	public Directivo(String dni, String nombre, String puesto, String departamento) {
		super(dni, nombre, puesto);
		Departamento = departamento;
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return Departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	@Override
	public String toString() {
		return "Directivo [Departamento=" + Departamento + "]";
	}
	
	}
