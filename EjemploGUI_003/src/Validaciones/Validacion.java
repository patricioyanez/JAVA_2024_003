package Validaciones;

public class Validacion {
    public static boolean soloLetras(String texto)
    {
        if(texto == null || texto.isEmpty())
            return false;
        
        return texto.matches("[a-zA-Z áéíóúÁÉÍÓÚÑñ]+");
    }
    public static boolean soloNumeros(String texto)
    {
        if(texto == null || texto.isEmpty())
            return false;
        
        return texto.matches("\\d+");
    }
    
}
