package org.cuatrovientos.dam.ed.ejdiagramasclase.ej4;

public class Producto {
    private String nombre;
    private boolean comprado;

    // Constructor
    public Producto(String nombre) {
        this.nombre = nombre;
        this.comprado = false; // Por defecto, el producto no está comprado
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para marcar como comprado
    public void marcarComprado() {
        this.comprado = true;
    }

    // Método para verificar si está comprado
    public boolean estaComprado() {
        return comprado;
    }

    // Método toString
    @Override
    public String toString() {
        return nombre + (comprado ? " (Comprado)" : " (Pendiente)");
    }
}