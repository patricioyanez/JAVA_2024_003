/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Vehiculo;

/**
 *
 * @author patri
 */
public class GestorVehiculo {
        ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();
    
    public boolean agregar(Vehiculo vehiculo)
    {
        return listado.add(vehiculo);
    }
    
    public String listarTodo()
    {
        String datos = "";
        for (Vehiculo vehiculo : listado) {
            datos += vehiculo.toString() + "\n";
        }
        return datos;
    }
    
}
