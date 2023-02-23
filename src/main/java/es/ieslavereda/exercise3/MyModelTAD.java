package es.ieslavereda.exercise3;

import es.ieslavereda.exercise1.Pet;
import es.ieslavereda.exercise2.IPetRepository;

import java.util.HashSet;
import java.util.Set;

public class MyModelTAD implements IPetRepository {

    private final Lista<Pet> myPets;
    public MyModelTAD(){
        myPets = new Lista<>();
    }

    public int size(){ return myPets.size();}
    @Override
    public void add(Pet pet) {
        myPets.add(pet);
    }
    @Override
    public Pet get(int index) {
        return myPets.get(index);
    }
    @Override
    public Pet remove(int index) {
        return myPets.remove(index);
    }

    @Override
    public Set<Pet> getAll() {
        Set<Pet> pets = new HashSet<>();
        for (int i = 0; i < myPets.size(); i++) {
            pets.add(myPets.get(i));
        }
        return pets;
    }

}
