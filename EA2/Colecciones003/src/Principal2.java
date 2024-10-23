
import java.util.ArrayList;

    // Ejercicio 30: crear una clase producto con 5 atributos
    // y agregar elementos a una colección.
    //mostrar todos los datos de los productos de la colección


public class Principal2 {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        
        Producto p1 = new Producto(100, "Cloro", "Clorinda", 10, 1000);
        Producto p2 = new Producto(110, "OMO 2.7lts", "OMo", 15, 10000);
        Producto p3 = new Producto(120, "Quix 200", "Quiz", 30, 2000);
        
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        
        System.out.println("|==== listado de productos ====|");
        for(Producto p: productos)
        {
            System.out.println(p);
        }
        // leer ppt 2.1.1.
    }
}
