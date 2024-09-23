
public class Principal {
    
    // psvm + tab
    // main + tab
    public static void main(String[] args) {
        
        Pizza pizza1 = new Pizza();
        pizza1.setNombre("Vegetariana");
        pizza1.setMasa("Delgada");
        pizza1.setTamano("Familiar");
        pizza1.setPrecio(10000);
        
        System.out.println("== Datos de la Pizza ==");
        System.out.println("Nombre  : " + pizza1.getNombre());
        System.out.println("Masa    : " + pizza1.getMasa());
        System.out.println("Tamaño  : " + pizza1.getTamano());
        System.out.println("Precio  : " + pizza1.getPrecio());
        
        // Ejercicio 2: CRear otra pizza y mostrar los datos
        Pizza pizza2 = new Pizza();
        
        pizza2.setNombre("Napolitana");
        pizza2.setMasa("Borde Queso");
        pizza2.setTamano("XL");
        pizza2.setPrecio(12000);
        
        System.out.println("== Datos de la Pizza ==");
        System.out.println("Nombre  : " + pizza2.getNombre());
        System.out.println("Masa    : " + pizza2.getMasa());
        System.out.println("Tamaño  : " + pizza2.getTamano());
        System.out.println("Precio  : " + pizza2.getPrecio());
        
        Pizza pizza3 = new Pizza();
        pizza3.setNombre("Hawaina");
        pizza3.setMasa("Borde Queso");
        pizza3.setTamano("grande");
        pizza3.setPrecio(15000);
        
        pizza3.imprimirDatos();
        
        Pizza pizza4 = new Pizza();
        pizza4.setNombre("Rodeo");
        pizza4.setMasa("delgada");
        pizza4.setTamano("personal");
        pizza4.setPrecio(5000);
        
        pizza4.imprimirDatos();
        //Lee la ppt 1.2.1
        
        Pizza pizza5 = new Pizza("Pollo bbq", "mediana", "gruesa", 14000);
//        pizza5.imprimirDatos();
        pizza5.setPrecio(15000);
        pizza5.imprimirDatos();
        
        // Ejercicio: Crear una pizza "5 quesos" usando constructor 
        // con parametros e imprimir los datos
        Pizza pizza6 = new Pizza("5 quesos", "familiar", "Masa piedra", 16000);
        pizza6.imprimirDatos();
    }
}
