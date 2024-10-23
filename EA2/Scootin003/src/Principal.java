public class Principal {
    public static void main(String[] args) {
        Puesto puesto1 = new Puesto(100, "gerente");
        Puesto puesto2 = new Puesto(120, "Supervisor");
        
        Empleado empleado1 = new Empleado("1-9", "Ana", "F", 2000, 40, puesto1);
        Empleado empleado2 = new Empleado("2-7", "Luis", "M", 2015, 25, puesto2);
        
        Empresa empresa = new Empresa();
        
        empresa.agregar(empleado1);
        
        if(empresa.buscarEmpleado("2-7"))
        {
            System.out.println("El rut ya existe");
        }
        else
        {
            empresa.agregar(empleado2);
            System.out.println("Datos guardados");
        }
        System.out.println("**** Listado de empleados *****");
        empresa.listarEmpleados();
    }
    
}
