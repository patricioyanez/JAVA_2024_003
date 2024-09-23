
public class Producto {
    private int codigo;
    private String descripcion;
    private Marca marca;
    private int precio;
    private int stock;
    
    public Producto() {
        this.codigo = 0;
        this.descripcion = "";
        this.marca = null; // new Marca();
        this.precio = 0;
        this.stock = 0;
    }
    
    public Producto(int codigo, String descripcion, Marca marca, int precio, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String imprimirDatos() {
        return  "\n==== Datos del Producto ====" + 
                "\nCódigo       = " + codigo + 
                "\nDescripción  = " + descripcion + 
                "\nMarca        = " + marca.getNombre() + 
                "\nPrecio       = " + precio + 
                "\nStock        = " + stock;
    }
    
    
}
