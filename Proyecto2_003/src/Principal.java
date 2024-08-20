
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
        

    }
}
