
public class Componente {
    private int codigo;
    private String marca;
    private String modelo;
    private String tipoComponente;
    private int capacidad;

    public Componente() {
        this.codigo = 0;
        this.marca = "";
        this.modelo = "";
        this.tipoComponente = "";
        this.capacidad = 0;
    }
    public Componente(int codigo, String marca, String modelo, String tipoComponente, int capacidad) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoComponente = tipoComponente;
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public String imprimirDatos() {
        return  "\n==== Datos del Componente" + 
                "\nCodigo           = " + codigo + 
                "\nMarca            = " + marca + 
                "\nModelo           = " + modelo + 
                "\nTipo Componente  = " + tipoComponente + 
                "\nCapacidad        = " + capacidad;
    }
    
    
}
