package es.ieslavereda.exercise2;

import es.ieslavereda.exercise1.Pet;
import java.util.Set;

public interface IPetRepository {
    /**
     * Add an Pet
     * @param pet to be added
     */
    void add(Pet pet);

    /**
     * Get a pet by position
     * @param index position
     * @return the pet in that position if exists
     */
    Pet get(int index);

    /**
     * Remove a pet by position
     * @param index position
     * @return the pet removed
     */
    Pet remove(int index);

    /**
     * Get all pets
     * @return all the pets
     */
    Set<Pet> getAll();

}
