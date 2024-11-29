package Tema3;
class Perro {
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro: Nombre = " + nombre + ", Edad = " + edad + ", Raza = " + raza;
    }

    public void hacerRuido() {
        System.out.println("guau");
    }
}

class Cliente {
    private String nombre;
    private String direccion;
    private Perro perro;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente: Nombre = " + nombre + ", Dirección = " + direccion + (perro != null ? ", Perro = [" + perro + "]" : ", Sin perro");
    }

    public void comprarPerro(Perro perro) {
        this.perro = perro;
    }
}

class Tienda {
    private String nombre;
    private String direccion;
    private Cliente cliente;

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Tienda: Nombre = " + nombre + ", Dirección = " + direccion + (cliente != null ? ", Cliente = [" + cliente + "]" : ", Sin cliente");
    }

    public void agregarCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}


