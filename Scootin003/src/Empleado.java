
public class Empleado {
    private String rut;
    private String nombre;
    private String genero;
    private int anioIngreso;
    private int edad;
    private Puesto puesto;

    public Empleado() {
        this.rut = "";
        this.nombre = "";
        this.genero = "";
        this.anioIngreso = 0;
        this.edad = 0;
        this.puesto = new Puesto(); // null;
    }
    public Empleado(String rut, String nombre, String genero, int anioIngreso, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombre = nombre;
        this.genero = genero;
        this.anioIngreso = anioIngreso;
        this.edad = edad;
        this.puesto = puesto;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  "\nRut          = " + rut + 
                "\nNombre       = " + nombre + 
                "\nGenero       = " + genero + 
                "\nAñoIngreso   = " + anioIngreso + 
                "\nEdad         = " + edad + 
                "\nPuesto       = " + puesto;
    }
    
    
    
}
