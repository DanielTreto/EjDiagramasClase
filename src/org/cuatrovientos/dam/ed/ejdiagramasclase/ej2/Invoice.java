package org.cuatrovientos.dam.ed.ejdiagramasclase.ej2;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private String customer;
    private List<Product> products;

    // Constructor con el nombre del cliente
    public Invoice(String customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Método para añadir un producto
    public void add(Product product) {
        products.add(product);
    }

    // Método para eliminar un producto por índice
    public void remove(int index) {
        if (index > 0 && index <= products.size()) {
            products.remove(index-1);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Método para calcular el total de la factura
    public float total() {
        float total = 0;
        for (Product product : products) {
            total += product.total();
        }
        return total;
    }

    // Método para mostrar la información de la factura
    public void mostrarInformacion() {
        System.out.println("Cliente: " + customer);
        System.out.println("Productos:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Total de la factura: " + total());
    }
}