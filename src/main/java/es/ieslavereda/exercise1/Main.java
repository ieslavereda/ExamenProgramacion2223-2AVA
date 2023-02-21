package es.ieslavereda.exercise1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    
    public static void main(String args[]) {
        
        Cat luna = new Cat("Luna", "Xavi", 5, new HashSet<>(Set.of(Color.WHITE,Color.BROWN,Color.ORANGE)), false);
        Cat pepa = new Cat("Pepa", "Xavi", 16, new HashSet<>(Set.of(Color.BLACK)), true);
        Cat anotherPepa = new Cat("Pepa", "Xavi", 16, new HashSet<>(Set.of(Color.WHITE)), false);
        Canary island = new Canary("island", "Joaquín",1,new HashSet<>(Set.of(Color.WHITE)),false,false);

        System.out.println(luna);
        island.setSinging(true);
        island.die();
        System.out.println(island);
        System.out.println(pepa.equals(anotherPepa));

        
    }
    
}
