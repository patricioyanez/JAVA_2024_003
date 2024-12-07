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
public class Mecanico {
    private String rut;
    private String nombre;

    public Mecanico() {
        this.rut = "";
        this.nombre = "";
    }
    
    
    public Mecanico(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Mecanico{" + "rut=" + rut + ", nombre=" + nombre + '}';
    }
    
    
}
