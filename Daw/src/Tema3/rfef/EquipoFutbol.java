package Tema3.rfef;
import java.time.LocalDate;

public class EquipoFutbol {
    // Atributos
    private String nombreEquipo;
    private String ciudad;
    private String nombreCampo;
    private LocalDate fechaFundacion;
    private Entrenador entrenador;
    private Portero porteroTitular;
    private Defensa central1;
    private Defensa central2;
    private Defensa interiorIzq;
    private Defensa interiorDcha;
    private Centrocampista centrocampista1;
    private Centrocampista centrocampista2;
    private Centrocampista centrocampista3;
    private Delantero extremoIzq;
    private Delantero extremoDcha;
    private Delantero delanteroCentro;
    private int puntos;

    // Constructor
    public EquipoFutbol(String nombreEquipo, String ciudad, String nombreCampo, LocalDate fechaFundacion,
                        Entrenador entrenador, Portero porteroTitular, Defensa central1, Defensa central2,
                        Defensa interiorIzq, Defensa interiorDcha, Centrocampista centrocampista1,
                        Centrocampista centrocampista2, Centrocampista centrocampista3, Delantero extremoIzq,
                        Delantero extremoDcha, Delantero delanteroCentro, int puntos) {
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.nombreCampo = nombreCampo;
        this.fechaFundacion = fechaFundacion;
        this.entrenador = entrenador;
        this.porteroTitular = porteroTitular;
        this.central1 = central1;
        this.central2 = central2;
        this.interiorIzq = interiorIzq;
        this.interiorDcha = interiorDcha;
        this.centrocampista1 = centrocampista1;
        this.centrocampista2 = centrocampista2;
        this.centrocampista3 = centrocampista3;
        this.extremoIzq = extremoIzq;
        this.extremoDcha = extremoDcha;
        this.delanteroCentro = delanteroCentro;
        this.puntos = puntos;
    }

    // Métodos getters y setters
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreCampo() {
        return nombreCampo;
    }

    public void setNombreCampo(String nombreCampo) {
        this.nombreCampo = nombreCampo;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Portero getPorteroTitular() {
        return porteroTitular;
    }

    public void setPorteroTitular(Portero porteroTitular) {
        this.porteroTitular = porteroTitular;
    }

    public Defensa getCentral1() {
        return central1;
    }

    public void setCentral1(Defensa central1) {
        this.central1 = central1;
    }

    public Defensa getCentral2() {
        return central2;
    }

    public void setCentral2(Defensa central2) {
        this.central2 = central2;
    }

    public Defensa getInteriorIzq() {
        return interiorIzq;
    }

    public void setInteriorIzq(Defensa interiorIzq) {
        this.interiorIzq = interiorIzq;
    }

    public Defensa getInteriorDcha() {
        return interiorDcha;
    }

    public void setInteriorDcha(Defensa interiorDcha) {
        this.interiorDcha = interiorDcha;
    }

    public Centrocampista getCentrocampista1() {
        return centrocampista1;
    }

    public void setCentrocampista1(Centrocampista centrocampista1) {
        this.centrocampista1 = centrocampista1;
    }

    public Centrocampista getCentrocampista2() {
        return centrocampista2;
    }

    public void setCentrocampista2(Centrocampista centrocampista2) {
        this.centrocampista2 = centrocampista2;
    }

    public Centrocampista getCentrocampista3() {
        return centrocampista3;
    }

    public void setCentrocampista3(Centrocampista centrocampista3) {
        this.centrocampista3 = centrocampista3;
    }

    public Delantero getExtremoIzq() {
        return extremoIzq;
    }

    public void setExtremoIzq(Delantero extremoIzq) {
        this.extremoIzq = extremoIzq;
    }

    public Delantero getExtremoDcha() {
        return extremoDcha;
    }

    public void setExtremoDcha(Delantero extremoDcha) {
        this.extremoDcha = extremoDcha;
    }

    public Delantero getDelanteroCentro() {
        return delanteroCentro;
    }

    public void setDelanteroCentro(Delantero delanteroCentro) {
        this.delanteroCentro = delanteroCentro;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    // Método para mostrar información del equipo
    public void mostrarInformacion() {
        System.out.println("Nombre del Equipo: " + nombreEquipo);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Nombre del Campo: " + nombreCampo);
        System.out.println("Fecha de Fundación: " + fechaFundacion);
        System.out.println("Entrenador: " + entrenador.getNombre());
        System.out.println("Portero Titular: " + porteroTitular.getNombre());
        System.out.println("Defensas: " + central1.getNombre() + ", " + central2.getNombre() +
                           ", " + interiorIzq.getNombre() + ", " + interiorDcha.getNombre());
        System.out.println("Centrocampistas: " + centrocampista1.getNombre() + ", " + 
                           centrocampista2.getNombre() + ", " + centrocampista3.getNombre());
        System.out.println("Delanteros: " + extremoIzq.getNombre() + ", " + extremoDcha.getNombre() +
                           ", " + delanteroCentro.getNombre());
        System.out.println("Puntos: " + puntos);
    }

    // Método para incrementar los puntos del equipo
    public void incrementarPuntos(int puntos) {
        this.puntos += puntos;
    }
}
