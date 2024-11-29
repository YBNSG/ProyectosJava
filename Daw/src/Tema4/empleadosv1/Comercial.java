package Tema4.empleadosv1;

public class Comercial extends Empleado {
	private double comision;

	/**
	 * @param dni
	 * @param nombre
	 * @param puesto
	 * @param comision
	 */
	public Comercial(String dni, String nombre, String puesto, double comision) {
		super(dni, nombre, puesto);
		this.comision = comision;
	}
	
	
	

}
