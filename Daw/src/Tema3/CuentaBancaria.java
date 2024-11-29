package Tema3;

public class CuentaBancaria {
    // Atributos
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
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
}
    
