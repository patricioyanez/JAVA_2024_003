
public class Electronico extends Producto{
    private String marca;
    private int garantiaMeses;

    public Electronico() {
        this.marca = "";
        this.garantiaMeses = 0;
    }

    public Electronico(String marca, int garantiaMeses, String idProducto, String nombre, Double precio) {
        super(idProducto, nombre, precio);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return  super.toString() + 
                "\nMarca        = " + marca + 
                "\nGarantiaMeses= " + garantiaMeses;
    }
    
    public void extenderGarantia(int mesesAdicionales)
    {
        if(mesesAdicionales >= 0)
            this.garantiaMeses += mesesAdicionales;
        else
            System.out.println("*** No puede agregar meses negativos");
    }
    
}
