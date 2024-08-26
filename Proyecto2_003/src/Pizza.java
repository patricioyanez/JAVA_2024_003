
public class Pizza {
    // atributos
    private String nombre;
    private String tamano;
    private String masa;
    private int precio;
    // constructores
    
    // getter y setter
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    // metodos personalizados
    public void imprimirDatos()
    {
        System.out.println("== Datos de la Pizza ==");
        System.out.println("Nombre  : " + this.getNombre());
        System.out.println("Masa    : " + getMasa());
        System.out.println("Tamaño  : " + this.tamano);
        System.out.println("Precio  : " + precio);
    }
}
