
public class PrincipalSentencias {
    public static void main(String[] args) {
        int numero = 0;
        
        if(numero == 0)
            System.out.println("Numero es cero 1");
            System.out.println("Numero es cero 2");
        
        if(numero == 0)
        {
            System.out.println("Condición Verdadera 1");
            System.out.println("Condición Verdadera 2");
            System.out.println("Condición Verdadera 3");
        }
        
        if(numero > 0)
        {
            System.out.println("El numero es mayor que cero");
        }
        else
        {
            System.out.println("El numero es menor o igual a cero");
        }
        
        int numero2 = 20;
        if(numero2 == 0)
            System.out.println("*** No es igual a cero");
        else if(numero2 > 0)
            System.out.println("*** El numero es mayor a cero");
        
        // if-else if- else
        if(numero2 == 0)
            System.out.println("*** No es igual a cero");
        else if(numero2 < 0)
            System.out.println("*** El numero es mayor a cero");
        else
            System.out.println("Todo es falso");
        
    }
}
