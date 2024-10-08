
public class Pez extends Animal {

    @Override
    public void mover() {
        System.out.println("El pez nada...");
    }

    @Override
    public int grabar() {
        System.out.println("Los datos del Pez fueron guardados");
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
        System.out.println("Total PEZ    : " + (COSTO_MINIMO_COMIDA+adicional));
    }

 

   
    
    
}
