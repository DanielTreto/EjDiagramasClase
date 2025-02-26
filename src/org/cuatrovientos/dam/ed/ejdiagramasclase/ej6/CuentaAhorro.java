package org.cuatrovientos.dam.ed.ejdiagramasclase.ej6;

public class CuentaAhorro extends CuentaBancaria {
    private static double interes=0.05;

    // Constructor
    public CuentaAhorro(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    // Método para aplicar el interés
    public void aplicarInteres() {
        saldo -= saldo * interes;
        System.out.println("Interés aplicado. Nuevo saldo: " + saldo);
    }

    // Sobrescribe el método mostrarInformacion para incluir el interés
    public void mostrarInformacion() {
    	super.mostrarInformacion();
        System.out.println("Interés: " + interes*100+"%\n");
    }
}