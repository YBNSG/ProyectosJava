package Tema4.Profesor;
class ProfesorTitularIvanGarciaSalon extends ProfesorIvanGarciaSalon {
    // Atributo adicional
    private int anosAntiguedad;

    // Constructor
    public ProfesorTitularIvanGarciaSalon(String dniProfesor, String nombre, String apellidos, int edad, Asignatura modulo, int anosAntiguedad) {
        super(dniProfesor, nombre, apellidos, edad, modulo);
        this.anosAntiguedad = anosAntiguedad;
    }

    // Método importeNomina - Las deducciones son 10€ por cada año de antigüedad
    public float importeNomina(float sueldoBase, float complementos) {
        float deducciones = 10.0f * anosAntiguedad;
        this.nomina = sueldoBase + complementos - deducciones;
        return this.nomina;
    }

    // Método toString
    @Override
    public String toString() {
        return "ProfesorTitularIvanGarciaSalon{" +
                "dniProfesor='" + getDniProfesor() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", edad=" + getEdad() +
                ", modulo=" + getModulo() +
                ", anosAntiguedad=" + anosAntiguedad +
                '}';
    }

    // Getter y setter para anosAntiguedad
    public int getAnosAntiguedad() {
        return anosAntiguedad;
    }

    public void setAnosAntiguedad(int anosAntiguedad) {
        this.anosAntiguedad = anosAntiguedad;
    }
}

