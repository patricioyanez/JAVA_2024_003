
public class Ropa extends Producto{
    private String talla;
    private String color;

    public Ropa() {
        this.talla = "";
        this.color = "";
    }

    public Ropa(String talla, String color, String idProducto, String nombre, Double precio) {
        super(idProducto, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTalla    = " + talla + 
                "\nColor    = " + color;
    }
    
    public void ajustarTalla(String nuevaTalla)
    {
        if("s m l xl xxl xxxl xxxxl".contains(nuevaTalla))
            this.talla = nuevaTalla;
        else
            System.out.println("***La talla no es válida");
    }
}
