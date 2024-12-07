/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author patri
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto() {
        this.cantidadPuertas = 0;
    }
    
    public Auto(int cantidadPuertas, String patente, String marca, String modelo) {
        super(patente, marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

}
