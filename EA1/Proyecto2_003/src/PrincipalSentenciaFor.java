
public class PrincipalSentenciaFor {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Numero: " + i);
        }
        int x = 1;
        for( ; x<=10 ; x++ )
        {
            System.out.println("Numero: " + x);
        }
        System.out.println("Numero final: " + x);
        
        int z = 0;
        System.out.println("z = " + (z++));
        System.out.println("z = " + (z++));
    }
}
