class Persona
{
    public Persona()
    {
        System.out.println("Soy persona");
    }
}
class Alumno extends Persona
{
    public Alumno()
    {
        System.out.println("Soy alumno");
    }  
}


public class AlumnoGratuidad extends Alumno{
     public AlumnoGratuidad()
    {
        System.out.println("Soy alumno con gratuidad");
    }    
     
    public static void main(String[] args) {
        AlumnoGratuidad ag = new AlumnoGratuidad();
    }
}
