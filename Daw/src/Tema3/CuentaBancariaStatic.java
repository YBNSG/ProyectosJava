package Tema3;

public class CuentaBancariaStatic {
    // Atributos de instancia
    private String titular;
    private double saldo;

    // Atributo estático para almacenar el número de cuentas creadas
    private static int numeroCuentas = 0;

    // Constructor
    public CuentaBancariaStatic(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        numeroCuentas++; // Incrementar el número de cuentas creadas
    }

    // Método para ingresar dinero
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    // Método para consultar el saldo actual
    public double consultarSaldo() {
        return saldo;
    }

    // Método para obtener el nombre del titular
    public String getTitular() {
        return titular;
    }

    // Método estático para obtener el número de cuentas creadas
    public static int getNumeroCuentas() {
        return numeroCuentas;
    }
}
