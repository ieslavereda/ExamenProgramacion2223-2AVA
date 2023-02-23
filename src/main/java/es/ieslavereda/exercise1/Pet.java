package es.ieslavereda.exercise1;

import java.util.Set;

public abstract class Pet implements Comparable<Pet>{

    // ATTRIBUTES
    private final String name;
    private final String owner;
    private int age;
    private boolean alive;
    private final Set<Color> colors;

    // CONSTRUCTOR
    public Pet(String name, String owner, int age, Set<Color> colors) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.colors = colors;
        this.alive = true;
    }

    // ABSTRACT METHODS
    public abstract void speak();

    public void anniversary() {
        this.age++;
    }
    public void die() {
        this.alive = false;
    }

    // GETTERS
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public boolean getAlive() {
        return alive;
    }
    public String getOwner() {
        return owner;
    }

    public Set<Color> getColors() {
        return colors;
    }

    @Override
    public String toString() {
        return "Pet --> " +
                "name=" + name + ", owner=" + owner + ", age=" + age + ", alive=" + alive;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pet))
            return false;
        Pet pet = (Pet) o;
        return (name.equals(pet.getName()) && owner.equals(pet.getOwner()) && age == pet.getAge());
    }

    @Override
    public int compareTo(Pet o) {
        return name.compareTo(o.getName());
    }
}
