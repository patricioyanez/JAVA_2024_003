
public class Cliente extends Persona {
    private Boolean esVip;
    private int lineaCredito;

    public Cliente() {
        this.esVip = false;
        this.lineaCredito = 0;
    }

    public Cliente(Boolean esVip, int lineaCredito, String rut, String nombre, int anioNacimiento, String direccion) {
        super(rut, nombre, anioNacimiento, direccion);
        this.esVip = esVip;
        this.lineaCredito = lineaCredito;
    }

    public int getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(int lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public Boolean getEsVip() {
        return esVip;
    }

    public void setEsVip(Boolean esVip) {
        this.esVip = esVip;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nEs Vip       = " + (esVip?"Si":"No") + 
                "\nLinea Crédito= " + lineaCredito;
    }

    @Override
    public void calcularEdad() {
        int edad = 2024 - this.getAnioNacimiento();
        System.out.println("El edad del cliente es: " + edad);
    }
    
    
    
}
