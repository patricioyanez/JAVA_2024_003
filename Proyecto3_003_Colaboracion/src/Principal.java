
public class Principal {

    public static void main(String[] args) {
        Marca marca1 = new Marca(100, "CocaCola", "Juan", "65498765");
        Producto producto1  = new Producto();
//        System.out.println(producto1.imprimirDatos());
        
        producto1.setCodigo(1000);
        producto1.setDescripcion("1lt envase de vidrio");
        producto1.setPrecio(1500);
        producto1.setStock(100);
        producto1.setMarca(marca1);
        System.out.println(producto1.imprimirDatos());
        
        System.out.println(producto1.getMarca().getNombre());
        System.out.println(producto1.getMarca().getContacto());
    }
    
}
