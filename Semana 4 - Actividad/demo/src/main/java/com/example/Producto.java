package com.example;

public class Producto {
    //1.------------------------
  //-Atributos
    private String nombre;
    private Double precio;
    private int stock;

  //-Constructor (DEF)
    public Producto() {
        this.nombre = "No definido";
        this.precio = 0.0;
        this.stock = 0;
    }

  //-Constructor (Par)
    public Producto(String nombre, Double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }


  //Getters
    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

  //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

  //Metodos
    public void mostrarInformacion() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Precio:" + precio);
        System.out.println("Stock:" + stock);
    }

    public void actualizarStock(int cantidad) {
        this.actualizarStock(cantidad++);
        if (stock<0){
            System.out.println("ERROR");
        }
    }

    public void calcularPrecioTotal() {
        System.out.println("Total: " + (precio*stock));
    }
}
