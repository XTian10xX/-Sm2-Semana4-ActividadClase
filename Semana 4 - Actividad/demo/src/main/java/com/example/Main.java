package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Producto producto = new Producto();

        Producto producto1 = new Producto("Camiseta", 15.99, 20);
        Producto producto2 = new Producto("Pantalon", 35.99, 10);
        Producto producto3 = new Producto("Zapatos", 60.99, 5);

        // Agregar productos a la tienda
        //tienda.agregarProducto(); --No pude lograrlo...T w T

        // Buscar un producto
        tienda.buscarProductoPorNombre("Camiseta");

        // Mostrar Productos con Stock Bajo
        tienda.mostrarProductosConStockBajo(3);

        // Calcular valor total del inventario
        producto.calcularPrecioTotal();
    } 
}