package Tema4.empleadosv2;

public class Empleado {
	private String dni;
	private String nombre;
	private String puesto;
	
	protected Empleado(String paramDni,String paramNombre) throws Exception {
		super();
		this.dni=paramDni;
		this.nombre=paramNombre;
		
		if (this instanceof Comercial) {
			this.puesto = "Comercial";}
		
	
		else if (this instanceof Directivo) {
			this.puesto = "Directivo";}
	
		else if (this instanceof Tecnico) {
			this.puesto = "Tecnico";}
		
		else
			throw new Exception ("Esa clase no esta implementada");
	}


	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", puesto=" + puesto + "]";
	}
	
	
	

}
