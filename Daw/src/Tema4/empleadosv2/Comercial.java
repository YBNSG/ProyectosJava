package Tema4.empleadosv2;

public class Comercial extends Empleado {
	private double comision;

	/**
	 * @param paramDni
	 * @param paramNombre
	 * @param comision
	 * @throws Exception 
	 */
	protected Comercial(String paramDni, String paramNombre, double comision) throws Exception {
		super(paramDni, paramNombre);
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Comercial [comision=" + comision + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
