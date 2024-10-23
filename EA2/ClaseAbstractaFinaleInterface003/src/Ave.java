
public class Ave extends Animal{

    @Override
    public void mover() {
        System.out.println("El ave vuela...");
    }
 
    public void comer()
    {
        System.out.println("come insectos...");
    }

    @Override
    public int grabar() {
        System.out.println("Los datos del Ave fueron guardados");
        return 1;
    }

    @Override
    public void limpiar() {
        System.out.println("Los datos del ave fueron limpiados");
    }
    
    @Override
    public void costoComida(int adicional) {
        System.out.println("El costo base es: " + COSTO_MINIMO_COMIDA);
        System.out.println("Costo adicional : " + adicional);
        System.out.println("Total Ave    : " + (COSTO_MINIMO_COMIDA+adicional));
    }
}
