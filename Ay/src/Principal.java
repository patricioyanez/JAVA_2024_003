import java.util.ArrayList;
import java.util.Scanner;

// Crear un menu que permita ingresar nombres, 
// apellidos y sus notas (1 por persona) y 
// otra para listarlos.
// Solicitar los datos por teclado.
public class Principal {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Integer> notas = new ArrayList<Integer>();
        Scanner leerTeclado = new Scanner(System.in);
        int opcion = 0;
        
        while(true)
        {
            System.out.println("|======= Menú ========|");
            System.out.println("1.-Ingresar datos");
            System.out.println("2.-Listar");
            System.out.println("3.-Salir");
            System.out.print("Ingrese opción: ");
            opcion = leerTeclado.nextInt();
            
            if(opcion == 3)
                break;
            if(opcion == 1)
            {
                System.out.println("***** Ingreso de datos *****");
                System.out.print("Nombre: ");
                String nombre = leerTeclado.next();
                System.out.print("Nota  : ");
                int nota = leerTeclado.nextInt();
                nombres.add(nombre);
                notas.add(nota);                
                System.out.println("=====> Datos guardados");
            }
            else if(opcion == 2)
            {
                System.out.println("***** Ingreso de datos *****");
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println("Nombre: " + nombres.get(i) +
                                        " nota: " + notas.get(i));
                }
                System.out.println("=====> Fin de listado");
            }
        }
        
    }
    
}
