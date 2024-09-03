
public class ClaseString {
    public static void main(String[] args) {
        String nombre = "Juan";
        String apellido = new String("Perez");
        
        System.out.println("Nombre  : " + nombre);
        System.out.println("Apellido: " + apellido);
        
        // longitud del texto
        String nombre2 = "María ";
        int valor = nombre2.length();
        System.out.println("Cant. Caracteres: " + valor);
        
        String nombre4 = " Diego ";
        System.out.println("****" + nombre4 + "****");
        System.out.println("****" + nombre4.trim() + "****");
        nombre4 = nombre4.trim();
        System.out.println("****" + nombre4 + "****");
        
        System.out.println("Mayúscula:" + nombre4.toUpperCase());
        System.out.println("Minúscula:" + nombre4.toLowerCase());
        
        //if(nombre4 == "Diego")
        if(nombre4.equals("Diego"))
        {
            System.out.println("Iguales");
        }
        else
            System.out.println("No son iguales");
        
        String nombre5 = "DieGO";
        
        if(nombre4.equalsIgnoreCase(nombre5))
        {
            System.out.println("Iguales 2");
        }
        else
            System.out.println("No son iguales 2");
        
        String mensaje = "Hola Mundo!!!";
        System.out.println(mensaje);
        mensaje = mensaje.replace("Hola", "Chao");
        System.out.println(mensaje);
        
        
        String rut = "10.250.500-1";
        System.out.println(rut);
        System.out.println(rut.replace(".",""));
        rut = rut.replace(".", "");
        String nroRut = rut.substring(0, 8);
        System.out.println("Nro Rut: " + nroRut);
        
        // Ejercio 5:
        // solicitar el rut, eliminar los espacios y puntos
        // y mostrar solo el DV. 
        
    }
}
