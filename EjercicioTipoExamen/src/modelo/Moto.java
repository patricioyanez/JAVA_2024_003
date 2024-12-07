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
public class Moto extends Vehiculo{
    private int medidaManillar;

    public Moto() {
        this.medidaManillar = 0;
    }
    public Moto(int medidaManillar, String patente, String marca, String modelo) {
        super(patente, marca, modelo);
        this.medidaManillar = medidaManillar;
    }

    public int getMedidaManillar() {
        return medidaManillar;
    }

    public void setMedidaManillar(int medidaManillar) {
        this.medidaManillar = medidaManillar;
    }

    
}
