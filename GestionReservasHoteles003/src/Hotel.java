
import java.util.ArrayList;


public class Hotel {
    private int id;
    private String nombre;
    private ArrayList<Habitacion> habitaciones;

    public Hotel() {
        this.id = 0;
        this.nombre = "";
        this.habitaciones = new ArrayList<Habitacion>();
    }
    
    public Hotel(int id, String nombre, ArrayList<Habitacion> habitaciones) {
        this.id = id;
        this.nombre = nombre;
        this.habitaciones = habitaciones;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        ArrayList<Habitacion> temp = new ArrayList<Habitacion>();
        for (Habitacion habitacion : this.habitaciones) {
            if(habitacion.getDisponible())
                temp.add(habitacion);
        }
        return temp;
    }

    public void setHabitaciones(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
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
    
    
}
