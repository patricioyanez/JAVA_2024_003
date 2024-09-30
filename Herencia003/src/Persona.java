
public class Persona {
    private String rut;
    private String nombre;
    private int anioNacimiento;
    private String direccion;

    public Persona() {
        this.rut = "";
        this.nombre = "";
        this.anioNacimiento = 0;
        this.direccion = "";
    }
    
    public Persona(String rut, String nombre, int anioNacimiento, String direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    @Override
    public String toString() {
        return  "\nRut              = " + rut + 
                "\nNombre           = " + nombre + 
                "\nAño Nacimiento   = " + anioNacimiento + 
                "\nDireccion        = " + direccion;
    }
    
    
    
}
