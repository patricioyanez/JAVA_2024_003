
public final class Moto extends Vehiculo{
    private String estilo;
    private int medidaManillar;

    public Moto() {
        this.estilo = "";
        this.medidaManillar = 0;
    }

    public Moto(String estilo, int medidaManillar, String patente, String marca, String modelo, String dueno, int precioServicio, int iva, int totalCobrar) {
        super(patente, marca, modelo, dueno, precioServicio, iva, totalCobrar);
        this.estilo = estilo;
        this.medidaManillar = medidaManillar;
    }

    public int getMedidaManillar() {
        return medidaManillar;
    }

    public void setMedidaManillar(int medidaManillar) {
        this.medidaManillar = medidaManillar;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "estilo=" + estilo + 
                ", medidaManillar=" + medidaManillar;
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
        int resultado = (int)(this.getPrecioServicio() * DESCUENTO_MOTO);
        this.setPrecioServicio(this.getPrecioServicio() - resultado);
        return resultado;
    }
    
    public int obtenerDescuento(double descuento) {
        int resultado = (int)(this.getPrecioServicio() * descuento);
        this.setPrecioServicio(this.getPrecioServicio() - resultado);
        return resultado;
    }
    
}
