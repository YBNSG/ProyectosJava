package Tema4.empleadosv2;

public class Tecnico extends Empleado {

	/**
	 * @param paramDni
	 * @param paramNombre
	 * @throws Exception 
	 */
	protected Tecnico(String paramDni, String paramNombre) throws Exception {
		super(paramDni, paramNombre);
	}

	@Override
	public String toString() {
		return "Tecnico [toString()=" + super.toString() + "]";
	}



}
