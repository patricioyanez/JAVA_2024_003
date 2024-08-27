import java.util.Scanner;

public class PrincipalSentenciaWhile {
    public static void main(String[] args) {        
        Scanner leerTeclado = new Scanner(System.in);
        
        int opcion = -1;
        while(opcion != 0)
        {
            System.out.println("===== Menú =====");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("0.- Salir");
            System.out.print("Ingrese opción:");
            opcion = leerTeclado.nextInt();
            
            if(opcion == 0)
            {
                break;
            }
            else if(opcion == 1)
            {
                System.out.println("=== Sumar ===");
            }
            else if (opcion == 2) {
                System.out.println("=== Restar ===");
            }
            else
            {
                System.out.println("La opción no es válida");                
                System.out.print("Presione c y enter para continuar ");
                leerTeclado.next();
                continue;
            }
            
            System.out.print("Presione c y enter para continuar ");
            leerTeclado.next();
        }
        System.out.println("******* Fin *********");
    }
}
