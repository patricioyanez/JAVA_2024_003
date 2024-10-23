
package modelo;


public class Marca {
    private int id;
    private String nombre;
    private Boolean habilitado;

    public Marca() {
        this.id = 0;
        this.nombre = "";
        this.habilitado = false;
    }
    
    public Marca(int id, String nombre, Boolean habilitado) {
        this.id = id;
        this.nombre = nombre;
        this.habilitado = habilitado;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void limpiar()
    {        
        this.id = 0;
        this.nombre = "";
        this.habilitado = false;  
    }
}
