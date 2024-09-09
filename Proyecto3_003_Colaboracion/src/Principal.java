public class Principal {

    public static void main(String[] args) {
        Marca marca1 = new Marca(100, "CocaCola", "Juan", "65498765");
        Marca marca2 = new Marca();
        marca2.setCodigo(200);
        marca2.setNombre("pepsi");
        marca2.setContacto("Ana");
        marca2.setTelefono("654659873");
        
        Producto producto1  = new Producto();
        Producto producto2 = new Producto(300, "3lt Desechable", marca2, 3000, 30);
//        System.out.println(producto1.imprimirDatos());
        
        producto1.setCodigo(1000);
        producto1.setDescripcion("1lt envase de vidrio");
        producto1.setPrecio(1500);
        producto1.setStock(100);
        producto1.setMarca(marca1);
        System.out.println(producto1.imprimirDatos());
        
        System.out.println(producto2.imprimirDatos());
        System.out.println("\n\n");
        System.out.println(producto1.getMarca().getNombre());
        System.out.println(producto1.getMarca().getContacto());
        
        // crear un 2do producto de marca pepsi, imprimir datos
    }
    
}
