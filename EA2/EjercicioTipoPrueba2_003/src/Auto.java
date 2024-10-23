
public class Auto extends Vehiculo {
    private int cantidadPuerta;
    private int capacidadMaletero;

    public Auto() {
        this.cantidadPuerta = 0;
        this.capacidadMaletero = 0;
    }

    public Auto(int cantidadPuerta, int capacidadMaletero, String patente, String marca, String modelo, String dueno, int precioServicio, int iva, int totalCobrar) {
        super(patente, marca, modelo, dueno, precioServicio, iva, totalCobrar);
        this.cantidadPuerta = cantidadPuerta;
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCantidadPuerta() {
        return cantidadPuerta;
    }

    public void setCantidadPuerta(int cantidadPuerta) {
        this.cantidadPuerta = cantidadPuerta;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCantidad de Puertas  = " + cantidadPuerta + 
                "\nCapacidad de Maletero= " + capacidadMaletero;
    }

    @Override
    public int totalPorPagar() {
        int resultado = this.getPrecioServicio() + getIva();
        this.setTotalCobrar(resultado);
        return resultado;
    }

    @Override
    public int totalConIVA() {
        int resultado = (int)(this.getPrecioServicio() * IVA);
        this.setIva(resultado);
        return resultado;
    }

    @Override
    public int obtenerDescuento() {
        int resultado = (int)(this.getPrecioServicio() * DESCUENTO_AUTO);
        this.setPrecioServicio(this.getPrecioServicio() - resultado);
        return resultado;
    }
    
    public int obtenerDescuento(double descuento) {
        int resultado = (int)(this.getPrecioServicio() * descuento);
        this.setPrecioServicio(this.getPrecioServicio() - resultado);
        return resultado;
    }
    
}
