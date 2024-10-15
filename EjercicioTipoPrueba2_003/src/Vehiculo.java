
public abstract class Vehiculo implements IOperaciones{
    private String patente;
    private String marca;
    private String modelo;
    private String dueno;
    private int precioServicio; // neto
    private int iva; 
    private int totalCobrar;

    public Vehiculo() {
        this.patente = "";
        this.marca = "";
        this.modelo = "";
        this.dueno = "";
        this.precioServicio = 0;
        this.iva = 0;
        this.totalCobrar = 0;
    }
    
    public Vehiculo(String patente, String marca, String modelo, String dueno, int precioServicio, int iva, int totalCobrar) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.dueno = dueno;
        this.precioServicio = precioServicio;
        this.iva = iva;
        this.totalCobrar = totalCobrar;
    }

    public int getTotalCobrar() {
        return totalCobrar;
    }

    public void setTotalCobrar(int totalCobrar) {
        this.totalCobrar = totalCobrar;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(int precioServicio) {
        this.precioServicio = precioServicio;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return  "\nPatente          =" + patente + 
                "\nMarca            =" + marca + 
                "\nModelo           =" + modelo + 
                "\nDueno            =" + dueno + 
                "\nPrecio Servicio  =" + precioServicio + 
                "\nIva              =" + iva + 
                "\nTotal a Cobrar   =" + totalCobrar;
    }
    
    public abstract int totalPorPagar();

}
