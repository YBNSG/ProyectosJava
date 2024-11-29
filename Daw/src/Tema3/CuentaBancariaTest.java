package Tema3;
//Clase de prueba
public class CuentaBancariaTest {
 public static void main(String[] args) {
     // Crear una cuenta a nombre del alumno con un saldo inicial de 1000€
     CuentaBancaria cuenta = new CuentaBancaria("Ivan García", 1000.0);

     // Ingresar 500€
     cuenta.ingresar(500.0);

     // Retirar 200€
     cuenta.retirar(200.0);

     // Mostrar el saldo actual
     System.out.println("El saldo actual de " + cuenta.getTitular() + " es: " + cuenta.consultarSaldo() + "€");
 }
}

