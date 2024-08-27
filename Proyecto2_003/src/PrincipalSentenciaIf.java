import java.util.Scanner;

public class PrincipalSentenciaIf {
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
        
        // Ejercicio:
        // preguntar al usuario un numero y enviar 
        // si es natural o no
        Scanner leerTeclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int valor = leerTeclado.nextInt();
        if(valor >= 0)
            System.out.println("Es un numero natural");
        else
            System.out.println("No es un numero natural");
        
        
        // Ejercicio:
        // Verificar si el numero es positivo, negativo o neutro.
        System.out.print("Ingrese un numero 2: ");
        int valor2 = leerTeclado.nextInt();
        
        if(valor2 == 0)
            System.out.println("El numero es neutro");
        else if(valor2 > 0)
            System.out.println("El numero es positivo");
        else
            System.out.println("El numero es negativo");
        
        // solicitar la edad y determinar el rango etario
        // niño, adolescente, adulto y 3ra edad
        
        System.out.print("Ingrese su edad: ");
        int edad = leerTeclado.nextInt();
        
        if (edad < 12) {
            System.out.println("Niño");            
        }
        else if (edad < 18) {
            System.out.println("Adolescente");
        }
        else if (edad < 65) {
            System.out.println("Adulto");
        }
        else
            System.out.println("Es adulto mayor");
    }
}
