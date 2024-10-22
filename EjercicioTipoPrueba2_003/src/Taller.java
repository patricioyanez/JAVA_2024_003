import java.util.ArrayList;

/*
Clase gestora
contine el ArrayList
Generar metodos CRUD
*/
public class Taller {
    ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();
    public boolean agregar(Vehiculo vehiculo)
    {
        // ejercicio 31: validar que patente no existe para 
        // agregar
        return listado.add(vehiculo);
    }
    // Ejercicio 30: crear metodo para saber si la patente ya existe 
    public void listar()
    {
        System.out.println("==== Listado de Vehiculos =====");
        for (Vehiculo vehiculo : listado) {
            System.out.println(vehiculo);
        }
    }
}
