package es.ieslavereda.exercise4;

import es.ieslavereda.exercise1.Pet;
import es.ieslavereda.exercise2.IPetRepository;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PetRepository implements IPetRepository {

    private final Set<Pet> pets;

    public static final Comparator<Pet> SORT_ALPH = (o1, o2) -> o1.getName().compareTo(o2.getName());
    public static final Comparator<Pet> SORT_AGE= new Comparator<>() {
        @Override
        public int compare(Pet o1, Pet o2) {
            return o1.getAge()- o2.getAge();
        }
    };

    public PetRepository(){
        pets = new LinkedHashSet<>();
    }

    public int size(){ return pets.size();}

    @Override
    public void add(Pet pet) { pets.add(pet);}

    @Override
    public Pet get(int index) {return (Pet) pets.toArray()[index];}

    @Override
    public Pet remove(int index) {
        Pet pet = get(index);
        pets.remove(pet);
        return pet;
    }

    @Override
    public Set<Pet> getAll() {return pets;}

}
