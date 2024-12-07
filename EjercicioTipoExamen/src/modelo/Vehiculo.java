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
public abstract class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;

    public Vehiculo(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Vehiculo() {
        this.patente = "";
        this.marca = "";
        this.modelo = "";
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
