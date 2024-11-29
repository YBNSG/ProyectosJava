package Tema4.Profesor;
import java.util.Calendar;

 public class ProfesorInterinoIvanGarciaSalon extends ProfesorIvanGarciaSalon {
    // Atributo adicional
    private Calendar fechaInicioInterinidad;

    // Constructor
    public ProfesorInterinoIvanGarciaSalon(String dniProfesor, String nombre, String apellidos, int edad, Asignatura modulo, Calendar fechaInicioInterinidad) {
        super(dniProfesor, nombre, apellidos, edad, modulo);
        this.fechaInicioInterinidad = fechaInicioInterinidad;
    }

    // Método importeNomina - Las deducciones son 100€ fijos
    public float importeNomina(float sueldoBase, float complementos) {
        float deducciones = 100.0f;
        this.nomina = sueldoBase + complementos - deducciones;
        return this.nomina;
    }

    // Método toString
    @Override
    public String toString() {
        return "ProfesorInterinoIvanGarciaSalon{" +
                "dniProfesor='" + getDniProfesor() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", edad=" + getEdad() +
                ", modulo=" + getModulo() +
                ", fechaInicioInterinidad=" + fechaInicioInterinidad.getTime() +
                '}';
    }

    // Getter y setter para fechaInicioInterinidad
    public Calendar getFechaInicioInterinidad() {
        return fechaInicioInterinidad;
    }

    public void setFechaInicioInterinidad(Calendar fechaInicioInterinidad) {
        this.fechaInicioInterinidad = fechaInicioInterinidad;
    }
}

