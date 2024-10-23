
public class Producto {
    private int codigo;
    private String descripcion;
    private String marca;
    private int stock;
    private int precio;

    public Producto(int codigo, String descripcion, String marca, int stock, int precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.stock = stock;
        this.precio = precio;
    }
    
    public Producto() {
        this.codigo = 0;
        this.descripcion = "";
        this.marca = "";
        this.stock = 0;
        this.precio = 0;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "\nCodigo       = " + codigo + 
                "\nDescripción  = " + descripcion + 
                "\nMarca        = " + marca + 
                "\nStock        = " + stock + 
                "\nPrecio       = " + precio;
    }
    
    
}
