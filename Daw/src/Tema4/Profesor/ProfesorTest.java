package Tema4.Profesor;
import java.util.Calendar;

public class ProfesorTest {
    public static void main(String[] args) {
        // Crear dos profesores interinos
        Calendar fechaInicio1 = Calendar.getInstance();
        fechaInicio1.set(2023, Calendar.DECEMBER, 1, 19, 42, 11);
        ProfesorInterinoIvanGarciaSalon profesorInterino1 = new ProfesorInterinoIvanGarciaSalon("45221887-K", "Juan Antonio", "Prime", 45, ProfesorIvanGarciaSalon.Asignatura.BBDD, fechaInicio1);
        profesorInterino1.importeNomina(1500.0f, 300.0f);

        Calendar fechaInicio2 = Calendar.getInstance();
        fechaInicio2.set(2023, Calendar.DECEMBER, 1, 19, 42, 11);
        ProfesorInterinoIvanGarciaSalon profesorInterino2 = new ProfesorInterinoIvanGarciaSalon("73232634-L", "Jose", "Fernández Prime", 87, ProfesorIvanGarciaSalon.Asignatura.ENTORNOS, fechaInicio2);
        profesorInterino2.importeNomina(1300.0f, 150.0f);

        // Crear dos profesores titulares
        ProfesorTitularIvanGarciaSalon profesorTitular1 = new ProfesorTitularIvanGarciaSalon("73-K", "Laura", "NoBancoChat", 32, ProfesorIvanGarciaSalon.Asignatura.MARCA, 5);
        profesorTitular1.importeNomina(2000.0f, 400.0f);

        ProfesorTitularIvanGarciaSalon profesorTitular2 = new ProfesorTitularIvanGarciaSalon("88-L", "Juan Antonio", "Prime", 49, ProfesorIvanGarciaSalon.Asignatura.PROGRAMACION, 10);
        profesorTitular2.importeNomina(1800.0f, 400.0f);

        // Mostrar los resultados por pantalla
        System.out.println("Listado claustro profesores **********");
        System.out.println(profesorInterino1);
        System.out.println(profesorInterino2);
        System.out.println(profesorTitular1);
        System.out.println(profesorTitular2);
    }
}
