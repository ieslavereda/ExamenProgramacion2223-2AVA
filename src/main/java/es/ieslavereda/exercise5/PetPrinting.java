package es.ieslavereda.exercise5;

import es.ieslavereda.exercise1.Canary;
import es.ieslavereda.exercise1.Cat;
import es.ieslavereda.exercise1.Color;
import es.ieslavereda.exercise1.Pet;
import es.ieslavereda.exercise4.PetRepository;

import java.util.*;
import java.util.stream.Collectors;

import static es.ieslavereda.exercise4.PetRepository.SORT_AGE;

public class PetPrinting {
    public static void main(String[] args) {

        Cat luna = new Cat("Luna", "Xavi", 5, new HashSet<>(Set.of(Color.WHITE,Color.BROWN,Color.ORANGE)), false);
        Cat pepa = new Cat("Pepa", "Xavi", 16, new HashSet<>(Set.of(Color.BLACK)), true);
        Cat blanca = new Cat("Blanca", "Joaquín", 16, new HashSet<>(Set.of(Color.WHITE)), false);
        Canary island = new Canary("Alona", "Joaquín",1,new HashSet<>(Set.of(Color.WHITE)),false,false);


        PetRepository petRepository = new PetRepository();
        petRepository.add(luna);
        petRepository.add(pepa);
        petRepository.add(blanca);
        petRepository.add(island);
        island.die();

        //List of all animals sorted alphabetically
        List<Pet> petList = new ArrayList<>();
        for (int i = 0; i < petRepository.size(); i++) {
            petList.add(petRepository.get(i));
        }
        petList.sort(PetRepository.SORT_ALPH);
        System.out.println(petList);


        //List of all alive animals sorted by age.
        System.out.println(petList.stream()
                .filter(Pet::getAlive)
                .sorted(SORT_AGE)
                .collect(Collectors.toList()));

        List<Pet> aux = new ArrayList<>();
        for (Pet p : petList) {
            if (p.getAlive())
                aux.add(p);
        }
        aux.sort(SORT_AGE);
        System.out.println(aux);

        //List of all white cats
        List<Pet> whities = petList.stream()
                .filter(pet -> pet.getColors().contains(Color.WHITE) && (pet instanceof Cat))
                .collect(Collectors.toList());
        System.out.println(whities);

    }
}
