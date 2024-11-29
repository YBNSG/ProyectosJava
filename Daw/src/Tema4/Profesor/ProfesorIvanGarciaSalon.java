package Tema4.Profesor;
public class ProfesorIvanGarciaSalon {
    // Atributos
    private String dniProfesor;
    private String nombre;
    private String apellidos;
    private int edad;
    protected float nomina; // Atributo protegido, puede ser accedido por clases hijas
    private Asignatura modulo;  // Este atributo representa las asignaturas del profesor

    // Enumeración de asignaturas
    public enum Asignatura {
        BBDD, MARCA, PROGRAMACION, ENTORNOS, INTERFACES
    }

    // Constructor
    public ProfesorIvanGarciaSalon(String dniProfesor, String nombre, String apellidos, int edad, Asignatura modulo) {
        this.dniProfesor = dniProfesor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.modulo = modulo;
    }

    // Método toString
    public String toString() {
        return "ProfesorIvanGarciaSalon{" +
                "dniProfesor='" + dniProfesor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", modulo=" + modulo +
                '}';
    }

    // Método importeNomina
    public float importeNomina(float sueldoBase, float complementos, float deducciones) {
        // Calcula la nómina restando las deducciones y sumando los complementos al sueldo base
        this.nomina = sueldoBase + complementos - deducciones;
        return this.nomina;
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProfesorIvanGarciaSalon that = (ProfesorIvanGarciaSalon) obj;
        return dniProfesor.equals(that.dniProfesor);
    }

    // Getters y setters (opcional, en caso de necesitar acceder o modificar atributos desde fuera)
    public String getDniProfesor() {
        return dniProfesor;
    }

    public void setDniProfesor(String dniProfesor) {
        this.dniProfesor = dniProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Asignatura getModulo() {
        return modulo;
    }

    public void setModulo(Asignatura modulo) {
        this.modulo = modulo;
    }

	public float importeNomina(float sueldoBase, float complementos) {
		// TODO Auto-generated method stub
		return 0;
	}
}
