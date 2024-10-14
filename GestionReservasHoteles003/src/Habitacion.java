
public class Habitacion {
    private int numero;
    private Double precio;
    private Boolean disponible;

    public Habitacion() {
        this.numero = 0;
        this.precio = 0.0;
        this.disponible = false;
    }
    public Habitacion(int numero, Double precio, Boolean disponible) {
        this.numero = numero;
        this.precio = precio;
        this.disponible = disponible;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
// VBA: Visual Basic Application
    @Override
    public String toString() {
        return  "Numero     = " + numero + 
                " Precio    = " + precio + 
                " Disponible= " + (disponible?"Si":"No");
    }
    
    
    
}
