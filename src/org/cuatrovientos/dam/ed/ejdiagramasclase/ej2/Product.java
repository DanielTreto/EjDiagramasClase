package org.cuatrovientos.dam.ed.ejdiagramasclase.ej2;

public class Product {
    private String name;
    private int qty;
    private float price;

    // Constructor vacío
    public Product() {
    }

    // Constructor con todos los atributos
    public Product(String name, int qty, float price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    // Método toString
    @Override
    public String toString() {
        return name + ", Cantidad: " + qty +", Precio: " + price;
    }

    // Método para calcular el total
    public float total() {
        return qty * price;
    }
}