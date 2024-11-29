package Tema3.rfef;
import java.time.LocalDate;

public class TestLiga {
    public static void main(String[] args) {
        // Crear las instancias de los jugadores y el entrenador para los equipos
        Entrenador entrenador1 = new Entrenador("José Mourinho", 58, 25);
        Portero portero1 = new Portero("Juan Pérez", 28, 150);
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

        // Crear instancias de los equipos
        EquipoFutbol equipo1 = new EquipoFutbol(
            "Los Campeones FC",
            "Madrid",
            "Estadio de Campeones",
            LocalDate.of(1923, 5, 15),
            entrenador1,
            portero1,
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

        // Repite el proceso para crear más equipos según sea necesario
        EquipoFutbol equipo2 = new EquipoFutbol(
            "Los Guerreros FC",
            "Barcelona",
            "Estadio de Guerreros",
            LocalDate.of(1950, 8, 12),
            entrenador1,
            portero1,
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
            40
        );

        EquipoFutbol equipo3 = new EquipoFutbol(
            "Atléticos de Oro",
            "Valencia",
            "Campo de Oro",
            LocalDate.of(1980, 3, 10),
            entrenador1,
            portero1,
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
            38
        );

        EquipoFutbol equipo4 = new EquipoFutbol(
            "Los Halcones",
            "Sevilla",
            "Nido de Halcones",
            LocalDate.of(1970, 6, 5),
            entrenador1,
            portero1,
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
            42
        );

        // Crear una instancia de la Liga
        Liga liga = new Liga(equipo1, equipo2, equipo3, equipo4);

        // Mostrar información inicial de la liga
        liga.mostrarInformacionLiga();

        // Simular un partido
        System.out.println("\nSimulación de un partido:");
        liga.simularPartido(equipo1, equipo2);

        // Mostrar información actualizada
        System.out.println("\nInformación actualizada de la liga:");
        liga.mostrarInformacionLiga();
    }
}

