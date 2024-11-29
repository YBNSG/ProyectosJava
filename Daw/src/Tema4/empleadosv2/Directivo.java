package Tema4.empleadosv2;

public class Directivo extends Empleado {
	private String Departamento;

	/**
	 * @param paramDni
	 * @param paramNombre
	 * @param departamento
	 * @throws Exception 
	 */
	protected Directivo(String paramDni, String paramNombre, String departamento) throws Exception {
		super(paramDni, paramNombre);
		Departamento = departamento;
	}

	@Override
	public String toString() {
		return "Directivo [Departamento=" + Departamento + ", toString()=" + super.toString() + "]";
	}
	

	

}
