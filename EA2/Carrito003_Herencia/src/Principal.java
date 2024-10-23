
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Electronico e1 = new Electronico("Sorny", 12, "3", "Tv", 25000.0);
        Ropa r1 = new Ropa("s", "Blanco", "5", "Polera", 5000.0);
        
        System.out.println(e1);
        e1.extenderGarantia(10);
        System.out.println(e1);
        
        
        System.out.println(r1);
        r1.ajustarTalla("l");
        System.out.println(r1);
        
    }
    
}
