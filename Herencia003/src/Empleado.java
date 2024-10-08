
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
// ejemplo de sobre escritura
    @Override
    public void calcularEdad() {
        int edad = 2024 - this.getAnioNacimiento();
        System.out.println("El edad del empleado es: " + edad);
    }
    
    public void calcularEdad(int anio) {
        int edad = anio - this.getAnioNacimiento();
        System.out.println("El edad del empleado es: " + edad);
    }
    //sobre carga
    public void calcularSueldo()
    {
        System.out.println("==== Liquidación de sueldo ====");
        System.out.println("Bruto   : " + sueldo);
        System.out.println("AFP     : " + (sueldo*.1));
        System.out.println("Salud   : " + (sueldo*.07));
        int liquido = sueldo - (int)((sueldo*.1) + (sueldo*.07));
        System.out.println("Liquido : " + liquido);
    }
    public void calcularSueldo(int descuento)
    {
        System.out.println("==== Liquidación de sueldo ====");
        System.out.println("Bruto       : " + sueldo);
        System.out.println("AFP         : " + (sueldo*.1));
        System.out.println("Salud       : " + (sueldo*.07));
        System.out.println("Descuesto   : " + descuento);
        int liquido = sueldo - (int)(descuento + (sueldo*.1) + (sueldo*.07));
        System.out.println("Liquido : " + liquido);
    }
    
    // ppt 2.2.1 
    
    
}
