
public class Cliente {
    private String rut;
    private String nombre;
    private int codigoArea;
    private int telefono;
    private String correo;
    private boolean esNuevo;

    public Cliente() {
        this.rut = "";
        this.nombre = "";
        this.codigoArea = 0;
        this.telefono = 0;
        this.correo = "";
        this.esNuevo = false;
    }
    
    public Cliente(String rut, String nombre, int codigoArea, int telefono, String correo, boolean esNuevo) {
        this.rut = rut;
        this.nombre = nombre;
        this.codigoArea = codigoArea;
        this.telefono = telefono;
        this.correo = correo;
        this.esNuevo = esNuevo;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if(rut.trim().length() == 0 )
        {
            System.out.println("|================> ERROR: El rut no es válido.");
            this.rut = "";
        }
        else
            this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.trim().length() == 0 )
        {
            System.out.println("|================> ERROR: El nombre no fue especificado.");
            this.nombre = "";
        }
        else
            this.nombre = nombre;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    public String imprimirDatos() {
        return  "\n|============ Cliente ============|" + 
                "\nRut              = " + rut + 
                "\nNombre           = " + nombre + 
                "\nCodigo de Area   = " + codigoArea + 
                "\nTelefono         = " + telefono + 
                "\nCorreo           = " + correo + 
                "\nEs Nuevo         = " + esNuevo;
    }
    
    
    
}
