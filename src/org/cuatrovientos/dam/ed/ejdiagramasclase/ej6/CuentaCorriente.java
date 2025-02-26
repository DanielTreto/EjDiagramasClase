package org.cuatrovientos.dam.ed.ejdiagramasclase.ej6;

public class CuentaCorriente extends CuentaBancaria {
    private double limiteDescubierto;

    // Constructor
    public CuentaCorriente(String numero, String titular, double saldo, double limiteDescubierto) {
        super(numero, titular, saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    // Sobrescribe el método retirar para permitir saldos negativos
    public void retirar(double cantidad) {
        if (cantidad > 0 && (saldo - cantidad) >= -limiteDescubierto) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Límite de descubierto excedido o cantidad inválida.");
        }
    }


    // Sobrescribe el método mostrarInformacion para incluir el límite de descubierto
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la clase base
        System.out.println("Límite de descubierto: -" + limiteDescubierto+"\n");
    }
}