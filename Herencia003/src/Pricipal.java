// En una empresa se requiere guardar los datos de clientes y empleados
// rut, nombre, año nacimiento, telefono, direccion, email.
// 
public class Pricipal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(true, 150000, "2-7", "Ana", 2000, "Vespucio 1501");
        Empleado empleado = new Empleado(550000, "Vendedor", "1-9", "Luis", 1990, "Cerrillos 50");

        System.out.println("===== Listado de cliente =====");
        System.out.println(cliente);
        System.out.println("\n===== Listado de Empleados =====");
        System.out.println(empleado);
    }
    
}
