/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patri
 */
public class Producto {
    private String idProducto;
    private String nombre;
    private Double precio;

    public Producto() {
        this.idProducto = "";
        this.nombre = "";
        this.precio = 0.0;
    }
    
    public Producto(String idProducto, String nombre, Double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  "\nId Producto  = " + idProducto + 
                "\nNombre       = " + nombre + 
                "\nPrecio       = " + precio;
    }
    
    
}
