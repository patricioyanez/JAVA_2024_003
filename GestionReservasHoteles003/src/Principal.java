
public class Principal {

    public static void main(String[] args) {
        Habitacion h1 = new Habitacion(1, 50000.0, true);
        Habitacion h2 = new Habitacion(2, 56000.0, true);
        Habitacion h3 = new Habitacion(1, 40000.0, true);
        Habitacion h4 = new Habitacion(2, 55000.0, false);
        Habitacion h5 = new Habitacion(3, 60000.0, true);
        
        Hotel hotel1 = new Hotel();
        hotel1.setId(1);
        hotel1.setNombre("All Inn");
        hotel1.setHabitaciones(h1);
        hotel1.setHabitaciones(h2);
        
        
        Hotel hotel2 = new Hotel();
        hotel2.setId(2);
        hotel2.setNombre("Hyatt");
        hotel2.setHabitaciones(h3);
        hotel2.setHabitaciones(h4);
        hotel2.setHabitaciones(h5);
        
        System.out.println("==== Hotel 1");
        hotel1.getHabitaciones();
        System.out.println("==== Hotel 2");
        hotel2.getHabitaciones();
    }
}
