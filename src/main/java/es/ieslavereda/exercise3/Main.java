package es.ieslavereda.exercise3;

import es.ieslavereda.exercise1.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cat luna = new Cat("Luna", "Xavi", 5, new HashSet<>(Set.of(Color.WHITE,Color.BROWN,Color.ORANGE)), false);
        Cat pepa = new Cat("Pepa", "Xavi", 16, new HashSet<>(Set.of(Color.BLACK)), true);
        Cat anotherPepa = new Cat("Pepa", "Xavi", 16, new HashSet<>(Set.of(Color.WHITE)), false);
        Canary island = new Canary("island", "Joaquín",1,new HashSet<>(Set.of(Color.WHITE)),false,false);

        MyModelTAD myModelTAD = new MyModelTAD();
        myModelTAD.add(luna);
        myModelTAD.add(pepa);
        myModelTAD.add(anotherPepa);
        myModelTAD.add(island);
        myModelTAD.add(luna);
        myModelTAD.add(pepa);
        myModelTAD.add(anotherPepa);
        myModelTAD.add(island);
        myModelTAD.remove(7);

        for (int i = 0; i < myModelTAD.size(); i++) {
            System.out.println(myModelTAD.get(i));
        }

        System.out.println("-------------------------");

        Set<Pet> pets = new HashSet<>(myModelTAD.getAll());
        for(Pet p : pets)
            System.out.println(p);


    }
}
