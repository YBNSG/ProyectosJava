package Tema3;

public class CuentaBancariaStaticTest {

	public static void main(String[] args) {
		
		  CuentaBancaria cuenta1 = new CuentaBancaria("Juan Perez", 500.0);
	      CuentaBancaria cuenta2 = new CuentaBancaria("Maria Lopez", 1000.0);
	      CuentaBancaria cuenta3 = new CuentaBancaria("Carlos Gomez", 200.0);
	      System.out.println("Número de cuentas creadas: " + CuentaBancariaStatic.getNumeroCuentas());
	      
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
