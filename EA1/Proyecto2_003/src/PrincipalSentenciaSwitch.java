import java.util.Scanner;

public class PrincipalSentenciaSwitch {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        
        System.out.print("Ingrese curso de enseñanza media:");
        String curso = leerTeclado.next();
        
        switch(curso)
        {
            case "1":
                System.out.println("Ud esta en 1er medio.");
                break;
            case "2":
                System.out.println("Ud esta en 2do medio.");
                break;
            case "3":
                System.out.println("Ud esta en 3ro medio.");
                break;
            case "4":
                System.out.println("Ud esta en 4to medio.");
                break;
            default:
                System.out.println("El valor no es válido");
        }


        
    }
}
