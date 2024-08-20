
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
    }
}
