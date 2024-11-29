package Tema3.rfef;
import java.time.LocalDate;

public class TestEquipoFutbol {
    public static void main(String[] args) {
        // Crear instancias de los jugadores
        Portero porteroTitular = new Portero("Juan Pérez", 28, 150);
        Defensa central1 = new Defensa("Carlos Martínez", 30, 200);
        Defensa central2 = new Defensa("Luis Gómez", 27, 180);
        Defensa interiorIzq = new Defensa("Sergio Ramos", 35, 250);
        Defensa interiorDcha = new Defensa("Javier Fernández", 29, 210);
        Centrocampista centrocampista1 = new Centrocampista("Pablo Sánchez", 25, 50);
        Centrocampista centrocampista2 = new Centrocampista("Miguel López", 24, 60);
        Centrocampista centrocampista3 = new Centrocampista("Raúl Díaz", 28, 55);
        Delantero extremoIzq = new Delantero("Fernando Torres", 32, 100);
        Delantero extremoDcha = new Delantero("Diego Costa", 31, 120);
        Delantero delanteroCentro = new Delantero("David Villa", 34, 150);

        // Crear instancia del entrenador
        Entrenador entrenador = new Entrenador("José Mourinho", 58, 25);

        // Crear la instancia del equipo de fútbol
        EquipoFutbol equipo = new EquipoFutbol(
            "Los Campeones FC",
            "Madrid",
            "Estadio de Campeones",
            LocalDate.of(1923, 5, 15),
            entrenador,
            porteroTitular,
            central1,
            central2,
            interiorIzq,
            interiorDcha,
            centrocampista1,
            centrocampista2,
            centrocampista3,
            extremoIzq,
            extremoDcha,
            delanteroCentro,
            45
        );

        // Mostrar la información del equipo
        equipo.mostrarInformacion();

        // Incrementar los puntos del equipo
        System.out.println("\nIncrementando los puntos del equipo...");
        equipo.incrementarPuntos(3);
        System.out.println("Nuevos puntos del equipo: " + equipo.getPuntos());
    }
}

