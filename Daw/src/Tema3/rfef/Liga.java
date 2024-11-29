package Tema3.rfef;
import java.util.Random;

public class Liga {
    // Atributos
    private EquipoFutbol equipo1;
    private EquipoFutbol equipo2;
    private EquipoFutbol equipo3;
    private EquipoFutbol equipo4;

    // Constructor
    public Liga(EquipoFutbol equipo1, EquipoFutbol equipo2, EquipoFutbol equipo3, EquipoFutbol equipo4) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.equipo3 = equipo3;
        this.equipo4 = equipo4;
    }

    // Métodos getters y setters
    public EquipoFutbol getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(EquipoFutbol equipo1) {
        this.equipo1 = equipo1;
    }

    public EquipoFutbol getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(EquipoFutbol equipo2) {
        this.equipo2 = equipo2;
    }

    public EquipoFutbol getEquipo3() {
        return equipo3;
    }

    public void setEquipo3(EquipoFutbol equipo3) {
        this.equipo3 = equipo3;
    }

    public EquipoFutbol getEquipo4() {
        return equipo4;
    }

    public void setEquipo4(EquipoFutbol equipo4) {
        this.equipo4 = equipo4;
    }

    // Método para mostrar información de la liga
    public void mostrarInformacionLiga() {
        System.out.println("Información de los equipos en la Liga:");
        equipo1.mostrarInformacion();
        System.out.println();
        equipo2.mostrarInformacion();
        System.out.println();
        equipo3.mostrarInformacion();
        System.out.println();
        equipo4.mostrarInformacion();
    }

    // Método para determinar el equipo con más puntos
    public void mostrarEquipoConMasPuntos() {
        EquipoFutbol equipoConMasPuntos = equipo1;

        if (equipo2.getPuntos() > equipoConMasPuntos.getPuntos()) {
            equipoConMasPuntos = equipo2;
        }
        if (equipo3.getPuntos() > equipoConMasPuntos.getPuntos()) {
            equipoConMasPuntos = equipo3;
        }
        if (equipo4.getPuntos() > equipoConMasPuntos.getPuntos()) {
            equipoConMasPuntos = equipo4;
        }

        System.out.println("El equipo con más puntos es: " + equipoConMasPuntos.getNombreEquipo());
        System.out.println("Puntos: " + equipoConMasPuntos.getPuntos());
    }

    // Método para simular un partido entre dos equipos
    public void simularPartido(EquipoFutbol equipoA, EquipoFutbol equipoB) {
        Random random = new Random();
        int golesEquipoA = random.nextInt(5); // Goles aleatorios entre 0 y 4
        int golesEquipoB = random.nextInt(5);

        System.out.println("Resultado del partido: " + equipoA.getNombreEquipo() + " " + golesEquipoA + " - " + golesEquipoB + " " + equipoB.getNombreEquipo());

        if (golesEquipoA > golesEquipoB) {
            System.out.println("Ganador: " + equipoA.getNombreEquipo());
            equipoA.incrementarPuntos(3); // 3 puntos por victoria
        } else if (golesEquipoA < golesEquipoB) {
            System.out.println("Ganador: " + equipoB.getNombreEquipo());
            equipoB.incrementarPuntos(3);
        } else {
            System.out.println("El partido terminó en empate.");
            equipoA.incrementarPuntos(1); // 1 punto por empate
            equipoB.incrementarPuntos(1);
        }
    }
}
