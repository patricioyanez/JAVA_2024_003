
package controlador;

import java.util.ArrayList;
import modelo.Mecanico;

/**
 *
 * @author patri
 */
public class GestorMecanico {
    ArrayList<Mecanico> listado = new ArrayList<Mecanico>();
    
    public boolean agregar(Mecanico mecanico)
    {
        return listado.add(mecanico);
    }
    
    public String listarTodo()
    {
        String datos = "";
        for (Mecanico mecanico : listado) {
            datos += mecanico.toString() + "\n";
        }
        return datos;
    }
    

}
