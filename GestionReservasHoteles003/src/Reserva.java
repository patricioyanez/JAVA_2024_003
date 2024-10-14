
public class Reserva {
    private int id;
    private String identificacionCliente;
    private String nombreCliente;
    private Hotel hotel;
    private Habitacion habitacionReservada;

    public Reserva() {
        this.id = 0;
        this.identificacionCliente = "";
        this.nombreCliente = "";
        this.hotel = null;
        this.habitacionReservada = null;
    }
    
    public Reserva(int id, String identificacionCliente, String nombreCliente, Hotel hotel, Habitacion habitacionReservada) {
        this.id = id;
        this.identificacionCliente = identificacionCliente;
        this.nombreCliente = nombreCliente;
        this.hotel = hotel;
        this.habitacionReservada = habitacionReservada;
    }

    public Habitacion getHabitacionReservada() {
        return habitacionReservada;
    }

    public void setHabitacionReservada(Habitacion habitacionReservada) {
        this.habitacionReservada = habitacionReservada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificacionCliente() {
        return identificacionCliente;
    }

    public void setIdentificacionCliente(String identificacionCliente) {
        this.identificacionCliente = identificacionCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return  "\nId                       = " + id + 
                "\nIdentificacion de Cliente= " + identificacionCliente + 
                "\nNombre de Cliente        = " + nombreCliente + 
                "\nHotel                    = " + hotel + 
                "\nHabitación Reservada     = " + habitacionReservada;
    }
    
    
}
