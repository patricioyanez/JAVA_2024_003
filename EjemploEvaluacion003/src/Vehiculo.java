public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private int kilometraje;
    private int costoServicio;
    private Cliente cliente;

    public Vehiculo() {
        this.patente = "";
        this.marca = "";
        this.modelo = "";
        this.kilometraje = 0;
        this.costoServicio = 0;
        this.cliente = null; // new Cliente();
    }
    
    public Vehiculo(String patente, String marca, String modelo, int kilometraje, int costoServicio, Cliente cliente) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.costoServicio = costoServicio;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if(patente.trim().length() != 6)
        {
            System.out.println("|================> ERROR: El formato de la patente no es válido.");
            this.patente = "";
        }
        else
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

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        if(kilometraje < 0 || kilometraje > 500000)
        {
            System.out.println("|================> ERROR: El kilometraje esta fuera del rango.");
            this.patente = "";
        }
        else
            this.kilometraje = kilometraje;
    }

    public int getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(int costoServicio) {
        this.costoServicio = costoServicio;
    }
    // metodos personalizados...

    public String imprimirDatos() {
        return  "\n|============ Vehículo ============|" + 
                "\nPatente          = " + patente + 
                "\nMarca            = " + marca + 
                "\nModelo           = " + modelo + 
                "\nKilometraje      = " + kilometraje + 
                "\nCosto de Servicio= " + costoServicio + 
                "\nCliente          = " + cliente.getNombre();
    }
    public void descuento()
    {
        if(this.cliente.isEsNuevo() || getCostoServicio() >= 100000)
            this.costoServicio = (int)(this.costoServicio * .9);
    }
    public void enviarCorreo()
    {
        String mensaje = "Estimado: " + cliente.getNombre() +
                        "\nLe informamos que su vehiculo patente " + this.patente +
                        "\nYa esta listo para retirar." +
                        "\nSu correo es: " + cliente.getCorreo();
        
        System.out.println(mensaje);
    }
}
