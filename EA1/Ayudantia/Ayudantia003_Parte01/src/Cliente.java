
public class Cliente {
    private String rut;
    private String nombre;
    private String apellido;
    private int telefono;
    private String email;

    public Cliente() {
        this.rut = "";
        this.nombre = "";
        this.apellido = "";
        this.telefono = 0;
        this.email = "";
    }
    
    public Cliente(String rut, String nombre, String apellido, int telefono, String email) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String imprimirDatos() {
        return  "\n=== Datos del cliente ===" + 
                "\nRut      = " + rut + 
                "\nNombre   = " + nombre + 
                "\nApellido = " + apellido + 
                "\nTelefono = " + telefono + 
                "\nEmail    = " + email;
    }
    
    
}
