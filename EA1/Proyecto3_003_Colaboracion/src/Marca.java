
public class Marca {
    private int codigo;
    private String nombre;
    private String contacto;
    private String telefono;
    
    public Marca() {
        this.codigo = 0;
        this.nombre = "";
        this.contacto = "";
        this.telefono = "";
    }
    
    public Marca(int codigo, String nombre, String contacto, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.contacto = contacto;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String imprimirDatos() {
        return  "\n==== Datos de la Marca ====" + 
                "\nCodigo=" + codigo + 
                "\nNombre=" + nombre + 
                "\nContacto=" + contacto + 
                "\nTeléfono=" + telefono;
    }
    
    
}
