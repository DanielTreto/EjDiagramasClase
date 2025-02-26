package org.cuatrovientos.dam.ed.ejdiagramasclase.ej4;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Producto> productos;

    // Constructor
    public ListaDeCompras() {
        this.productos = new ArrayList<>();
    }

    // Método para agregar un producto
    public void agregarProducto(String nombre) {
        Producto producto = new Producto(nombre);
        productos.add(producto);
        System.out.println("Producto agregado: " + nombre);
    }

    // Método para marcar un producto como comprado por índice
    public void marcarComoComprado(int index) {
        if (index > 0 && index <= productos.size()) { // Validar que el índice sea válido
            Producto producto = productos.get(index - 1); // Restar 1 para ajustar a la lista basada en 0
            producto.marcarComprado(); // Marcar como comprado
            System.out.println("Producto marcado como comprado: " + producto.getNombre());
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Método para eliminar un producto por índice
    public void eliminarProducto(int index) {
        if (index > 0 && index <= productos.size()) { // Validar que el índice sea válido
            Producto productoEliminado = productos.remove(index - 1); // Eliminar el producto
            System.out.println("Producto eliminado: " + productoEliminado.getNombre());
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Método para mostrar la lista de productos
    public void mostrarLista() {
        if (productos.isEmpty()) {
            System.out.println("La lista de compras está vacía.");
        } else {
            System.out.println("Lista de compras:");
            for (int i = 0; i < productos.size(); i++) {
                System.out.println((i + 1) + ". " + productos.get(i));
            }
        }
    }
}