package es.ieslavereda.exercise1;

import java.util.Set;

public class Cat extends Pet {

    // ATTRIBUTES
    private final boolean longHair;
    
    // CONSTRUCTOR
    public Cat(String name, String owner, int age, Set<Color> colors, boolean longHair) {
        super(name, owner, age, colors);
        this.longHair = longHair;
    }

    public void speak() {
        System.out.println("MIAU MIAU");
    }

    // GETTER
    public boolean getLongHair() {
        return longHair;
    }

}
