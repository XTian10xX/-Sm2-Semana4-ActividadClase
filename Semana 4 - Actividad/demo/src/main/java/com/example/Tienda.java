package com.example;

import java.util.ArrayList;

public class Tienda {
    // Atributo
    ArrayList<Producto> productos;

    // Constructor
    public Tienda() {
        this.productos = new ArrayList<>();
    }

    // Metodos
    public void agregarProducto(Producto productos) {
        this.productos.add(productos);
    }

    public Producto buscarProductoPorNombre(String nombre) {
        int index = this.productos.indexOf(nombre);
        if (index >= 0) {
            return this.productos.get(index);
        } else {
            return null;
        }
    }

    public double calcularValorTotalInventario() {
        double sumatoria =0;
        for (Producto producto : productos) {
            sumatoria += producto.getPrecio();
        }
        return sumatoria;
    }

    /*public void mostrarProductosConStockBajo(int limite) {
        int stockProductosBajo = 0;
        if (stockProductosBajo >= 5) {
            Producto = 
        }
    }*/
}
