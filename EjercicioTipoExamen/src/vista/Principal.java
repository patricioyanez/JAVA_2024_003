/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestorMecanico;
import modelo.Mecanico;

/**
 *
 * @author patri
 */
public class Principal {
    public static void main(String[] args) {
        
        Mecanico m1 = new Mecanico("1-9", "Ana");
        Mecanico m2 = new Mecanico("2-7", "Luis");
        Mecanico m3 = new Mecanico("3-5", "Andrea");

        GestorMecanico gm = new GestorMecanico();
        gm.agregar(m1);
        gm.agregar(m2);
        gm.agregar(m3);
        
        String x = gm.listarTodo();
        System.out.println(x);
    }
    
    
}
