package es.ieslavereda.exercise2;

import es.ieslavereda.exercise1.Pet;
import java.util.Set;

public interface IPetRepository {
    /**
     * Add an Pet
     * @param pet to be added
     */
    public void add(Pet pet);

    /**
     * Get a pet by position
     * @param id position
     * @return the pet in that position if exists
     */
    public Pet get(int id);


    /**
     * Remove a pet by position
     * @param id position
     * @return the pet removed
     */
    public Pet remove(int id);

    /**
     * Update a pet
     * @param pet to be updated
     * @return whether the change was performed
     */
    public boolean update(Pet pet);


    /**
     * Get all pets
     * @return all the pets
     */
    public Set<Pet> getAll();




}
