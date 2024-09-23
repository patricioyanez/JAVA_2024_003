import java.util.Scanner;

public class Principal {
    // main es el punto de arranque
    public static void main(String args[])
    {
        // print sin y con salto de linea
        System.out.print("Hola Mundo!!!");
        System.out.println("Hola Mundo 2!!!");
        
        // input
        Scanner leerTeclado = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = leerTeclado.next();
        //ver los tipos de datos en java
        // sout + tab
        System.out.println("Bienvenido " + nombre);
        
        // solicitar el apellido y mostrar lo con el nombre
        
        String apellido = leerTeclado.next();
        //ver los tipos de datos en java
        // sout + tab
        System.out.println("Bienvenido " + nombre + " " + apellido);
        // creacion de objetos
        Pizza pizza1 = new Pizza();
        
        Pizza pizza2;
        pizza2 = new Pizza();
        
        pizza1.nombre = "Napolitana";
        pizza1.precio = 5000;
        pizza1.tamano = "Familiar";
        pizza1.tipoMasa= "Delgada";
        
        System.out.println("\n***** Datos Pizza 1 *****");
        System.out.println("Nombre: " + pizza1.nombre);
        
        // agregar datos a la pizza2 y mostrar todos los datos
        
    }    
}
