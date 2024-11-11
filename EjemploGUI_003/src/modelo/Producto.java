package modelo;

public class Producto {
    private int id;
    private int idMarca;
    private int idCategoria;
    private long codigo;
    private String descripcion;
    private int stock;
    private int precioCosto;
    private int precioVenta;

    public Producto() {
        this.id = 0;
        this.idMarca = 0;
        this.idCategoria = 0;
        this.codigo = 0;
        this.descripcion = "";
        this.stock = 0;
        this.precioCosto = 0;
        this.precioVenta = 0;
    }
    
    public Producto(int id, int idMarca, int idCategoria, long codigo, String descripcion, int stock, int precioCosto, int precioVenta) {
        this.id = id;
        this.idMarca = idMarca;
        this.idCategoria = idCategoria;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(int precioCosto) {
        this.precioCosto = precioCosto;
    }
    
    
    
}
