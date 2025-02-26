package org.cuatrovientos.dam.ed.ejdiagramasclase.ej2;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Product product1 = new Product("Manzana", 5, 1.2f);
        Product product2 = new Product("Pan", 2, 0.8f);

        // Crear una factura
        Invoice invoice = new Invoice("Juan Pérez");

        // Añadir productos a la factura
        invoice.add(product1);
        invoice.add(product2);

        // Mostrar información de la factura
        invoice.mostrarInformacion();

        // Eliminar un producto de la factura
        invoice.remove(1);

        // Mostrar información de la factura después de eliminar un producto
        System.out.println("\nDespués de eliminar un producto:");
        invoice.mostrarInformacion();
    }
}
