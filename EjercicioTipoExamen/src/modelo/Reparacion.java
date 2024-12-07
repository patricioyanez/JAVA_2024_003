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
public class Reparacion {
    private int numeroOrden;
    private Mecanico mecanico; // quien realiza la reparacion
    private Vehiculo vehiculo; // que vehiculo se repara
    private String comentario;

    public Reparacion() {
        this.numeroOrden = 0;
        this.mecanico = null;
        this.vehiculo = null;
        this.comentario = "";
    }
    

    public Reparacion(int numeroOrden, Mecanico mecanico, Vehiculo vehiculo, String comentario) {
        this.numeroOrden = numeroOrden;
        this.mecanico = mecanico;
        this.vehiculo = vehiculo;
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
}
