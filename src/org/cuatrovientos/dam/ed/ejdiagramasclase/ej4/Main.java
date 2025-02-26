package org.cuatrovientos.dam.ed.ejdiagramasclase.ej4;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de compras
        ListaDeCompras lista = new ListaDeCompras();

        // Agregar productos a la lista
        lista.agregarProducto("Manzanas");
        lista.agregarProducto("Pan");
        lista.agregarProducto("Leche");

        // Mostrar la lista de compras
        lista.mostrarLista();

        // Marcar un producto como comprado (índice basado en 1)
        lista.marcarComoComprado(2); // Marcar el segundo producto (Pan) como comprado

        // Mostrar la lista de compras después de marcar un producto como comprado
        System.out.println("\nDespués de marcar un producto como comprado:");
        lista.mostrarLista();

        // Eliminar un producto (índice basado en 1)
        lista.eliminarProducto(1); // Eliminar el primer producto (Manzanas)

        // Mostrar la lista de compras después de eliminar un producto
        System.out.println("\nDespués de eliminar un producto:");
        lista.mostrarLista();

        // Intentar marcar un producto con un índice inválido
        lista.marcarComoComprado(5); // Índice inválido

        // Intentar eliminar un producto con un índice inválido
        lista.eliminarProducto(5); // Índice inválido
    }
}