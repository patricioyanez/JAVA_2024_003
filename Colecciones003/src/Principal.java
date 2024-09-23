import java.util.ArrayList;


public class Principal {


    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        
        String nombre1 = "Ana";
        String nombre2 = new String("Diego");
        
        nombres.add("Juan");
        nombres.add(nombre1);
        nombres.add(nombre2);
        
        //foreach
        for(String nombre: nombres)
        {
            System.out.println("Nombre: " + nombre);
        }
        // for con indice
        System.out.println("Usando Indice");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nombre indice " + i +": " + nombres.get(i));
        }
        
        // buscar elemento
        boolean fueEncontrado = nombres.contains("Esteban");
        if(fueEncontrado)
            System.out.println("El nombre si existe");
        else
            System.out.println("El nombre no fue encontrado");
        
        
        // mostrar elemento según indice
        System.out.println("Nombre indice 2: " + nombres.get(2));
        
        
        // buscar un elemento y obtener el indice
        
        nombres.add("Ana");
        int indice = nombres.indexOf("Ana");
        System.out.println("Indice 1ra coincidencia: " + indice);
        System.out.println("valor: " + nombres.get(indice));
        
        indice = nombres.lastIndexOf("Ana");
        System.out.println("Indice 1ra coincidencia: " + indice);
        System.out.println("valor: " + nombres.get(indice));
        
        // eliminar un elemento
        System.out.println("|=======> Eliminación");
        for(String nombre: nombres)
        {
            System.out.println("Nombre: " + nombre);
        }
        nombres.remove(3);
        nombres.remove("Ana");
        System.out.println("===> Lista actualizada");
        for(String nombre: nombres)
        {
            System.out.println("Nombre: " + nombre);
        }
        
        // obtener tamaño de la colección
        
        System.out.println("Tamaño: " + nombres.size());
        
    }
    
}
