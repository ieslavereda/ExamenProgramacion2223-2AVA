package es.ieslavereda.exercise3;

import es.ieslavereda.exercise1.Pet;
import es.ieslavereda.exercise2.IPetRepository;
import es.ieslavereda.exercise2.MyModelTAD;

import java.util.HashSet;
import java.util.Set;

/**
 * In order to simulate the behavior of the database, create a class allowing the animal storage. In order to do it, you have to:
 * a.	Create a dynamic structure with generic types that allows all operations of the previous interface.
 * b.	Create a class MyModelTAD that contain as attribute a generic list defined in the previous point.
 * c.	Implement the IPetRepository interface.
 */

public class PetRepository implements IPetRepository {

    private MyModelTAD<Pet> myPets;
    public PetRepository(){
        myPets = new MyModelTAD<>();
    }

    @Override
    public void add(Pet pet) {
        myPets.add(pet);
    }
    @Override
    public Pet get(int id) {
        return myPets.get(id);
    }
    @Override
    public Pet remove(int id) {
        return null;
    }

    @Override
    public boolean update(Pet pet) {
        return false;
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
