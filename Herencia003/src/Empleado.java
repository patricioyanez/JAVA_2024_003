
public class Empleado extends Persona{
    private int sueldo;
    private String cargo;

    public Empleado() {
//        super();
        this.sueldo = 0;
        this.cargo = "";
    }

    public Empleado(int sueldo, String cargo, String rut, String nombre, int anioNacimiento, String direccion) {
        super(rut, nombre, anioNacimiento, direccion);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nSueldo = " + sueldo + 
                "\nCargo  = " + cargo;
    }

    @Override
    public void calcularEdad() {
        int edad = 2024 - this.getAnioNacimiento();
        System.out.println("El edad del empleado es: " + edad);
    }
    
    
}
