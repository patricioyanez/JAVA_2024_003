import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        int opcion = 0;
        Cliente cliente = new Cliente();
        Vehiculo vehiculo = new Vehiculo();
        
        while(true)
        {
            System.out.println("============ Menú ============");
            System.out.println("1.- Crear Cliente y Vehiculo");
            System.out.println("2.- Mostrar información");
            System.out.println("3.- Agregar monto de servicio y descuento");
            System.out.println("4.- Enviar correo");
            System.out.println("5.- Salir");
            System.out.print("Ingrese su opción:");
            opcion = leerTeclado.nextInt();
            
            if(opcion == 1)
            {
                cliente.setRut("500000-5");
                cliente.setNombre("Juan");
                cliente.setCorreo("fasdfa@mail.com");
                cliente.setCodigoArea(32);
                cliente.setTelefono(89798465);
                cliente.setEsNuevo(true);
                
                vehiculo.setPatente("asdf60");
                vehiculo.setMarca("Kia");
                vehiculo.setModelo("Soul");
                vehiculo.setKilometraje(50000);
                vehiculo.setCostoServicio(0);
                vehiculo.setCliente(cliente);
                System.out.println("**** Datos Creados ****");
            }
            else if(opcion == 2)
            {
                System.out.println("****** Mostrar Datos *******");
                System.out.println(vehiculo.imprimirDatos());
                System.out.println(cliente.imprimirDatos());
            }
            else if(opcion == 3)
            {
                System.out.println("****** Cobro de servicio ********");
                System.out.print("Ingrese monto: ");
                int valor = leerTeclado.nextInt();
                
                vehiculo.setCostoServicio(valor);
                vehiculo.descuento();
                System.out.println("==> Valor a pagar: $" + vehiculo.getCostoServicio());
            }
            else if(opcion == 4)
            {                
                System.out.println("****** Envio de correo********");
                vehiculo.enviarCorreo();
                System.out.println("Correo enviado");
            }
            else if(opcion == 5)
            {
                break;
            }
            else
            {
                System.out.println("Opción ingresada no es válida");
            }
            System.out.println("******** Presione C para continuar");
            leerTeclado.next();
        }        
    }    
}
