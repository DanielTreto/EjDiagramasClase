package org.cuatrovientos.dam.ed.ejdiagramasclase.ej6;

public class Main {
    public static void main(String[] args) {
        // Crear una cuenta de ahorro
        CuentaAhorro cuentaAhorro = new CuentaAhorro("12345", "Juan Pérez", 1000);
        System.out.println("Información de la cuenta de ahorro:");
        cuentaAhorro.mostrarInformacion();

        // Aplicar interés a la cuenta de ahorro
        cuentaAhorro.aplicarInteres();
        System.out.println("\nInformación de la cuenta de ahorro después de aplicar interés:");
        cuentaAhorro.mostrarInformacion();

        // Crear una cuenta corriente
        CuentaCorriente cuentaCorriente = new CuentaCorriente("67890", "Ana Gómez", 500, 200);
        System.out.println("\nInformación de la cuenta corriente:");
        cuentaCorriente.mostrarInformacion();

        // Retirar dinero de la cuenta corriente
        cuentaCorriente.retirar(600);
        System.out.println("\nInformación de la cuenta corriente después de retirar 600:");
        cuentaCorriente.mostrarInformacion();

        // Intentar retirar más dinero del límite permitido
        cuentaCorriente.retirar(200);
        System.out.println("\nInformación de la cuenta corriente después de intentar retirar 200:");
        cuentaCorriente.mostrarInformacion();
    }
}
