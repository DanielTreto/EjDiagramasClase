package org.cuatrovientos.dam.ed.ejdiagramasclase.ej6;

public class CuentaBancaria {
    protected String numero;
    protected String titular;
    protected double saldo;

    // Constructor
    public CuentaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    // Método para mostrar información de la cuenta
    public void mostrarInformacion() {
    	System.out.println("Número: " + numero + "\n" +"Titular: " + titular + "\n" +"Saldo: " + saldo);
    }
}