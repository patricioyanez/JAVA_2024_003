import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        //Animal animal = new Animal(); // error
        
        Ave pollo = new Ave();
        pollo.mover();
        
        Pez salmon = new Pez();
        salmon.mover();
        
        System.out.println("\n\n====== Polimorfismo ========");
        ArrayList<Animal> zoologico = new ArrayList<Animal>();
        
        zoologico.add(pollo);
        zoologico.add(salmon);
        zoologico.add(new Ave());
        for(Animal animal : zoologico)
        {
            animal.mover();
            
            if(animal instanceof Ave)
            {
                //((Ave) animal).comer();
                Ave avecita = (Ave)animal;
                avecita.comer();
                avecita.costoComida(5000);
            }
            else
            {
                animal.costoComida(10000);
            }
        }
        
        
    }
    
}
