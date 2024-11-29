package Tema3;
public class TiendaMascotasTest {
    public static void main(String[] args) {
        // Crear la mascota
        Perro miPerro = new Perro("Rex", 3, "Pastor Alemán");
        
        // Crear un cliente y asignarle la mascota
        Cliente cliente1 = new Cliente("Juan Pérez", "Calle Falsa 123");
        cliente1.comprarPerro(miPerro);
        
        // Crear la tienda y asignarle el cliente
        Tienda tienda1 = new Tienda("PetShop La Felicidad", "Av. Siempre Viva 742");
        tienda1.agregarCliente(cliente1);
        
        // Imprimir la tienda por consola
        System.out.println(tienda1);
    }
}

